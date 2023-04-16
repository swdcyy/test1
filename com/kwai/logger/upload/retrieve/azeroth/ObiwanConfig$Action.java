package com.kwai.logger.upload.retrieve.azeroth.ObiwanConfig$Action;
import java.io.Serializable;
import java.lang.Object;
import java.util.List;
import java.util.Collections;

public class ObiwanConfig$Action implements Serializable	// class@000ee6
{
    public boolean supportRealTimeLog;
    public List taskList;

    public void ObiwanConfig$Action(){
       super();
       this.taskList = Collections.emptyList();
       this.supportRealTimeLog = false;
    }
}
