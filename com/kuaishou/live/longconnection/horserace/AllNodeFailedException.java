package com.kuaishou.live.longconnection.horserace.AllNodeFailedException;
import java.lang.Exception;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

public class AllNodeFailedException extends Exception	// class@000c7f
{
    public final List mExceptions;

    public void AllNodeFailedException(List p0){
       super();
       ArrayList uArrayList = new ArrayList();
       this.mExceptions = uArrayList;
       uArrayList.addAll(p0);
    }
}
