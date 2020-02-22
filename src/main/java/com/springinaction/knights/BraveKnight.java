package com.springinaction.knights;

import org.aspectj.lang.annotation.Pointcut;

public class BraveKnight implements Knight{
    private Quest quest;
    private Minstrel minstrel;

    public BraveKnight (Quest  quest) {
        this.quest = quest;
//        this.minstrel = minstrel;
    }


    @Pointcut("execution(* embarkOnQuest(..))")
    public void embarkOnQuest() {
//        minstrel.singBeforeQuest();
        quest.embark();
//        minstrel.singAfterQuest();
    }
}
