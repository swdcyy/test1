package com.kwai.logger.upload.model.StartExtra;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;

public class StartExtra implements Serializable	// class@000ee4
{
    public String cmd;
    public List dateRangeList;
    public int networkType;
    public List pathList;

    public void StartExtra(){
       super();
       this.cmd = "";
       this.pathList = new ArrayList();
       this.dateRangeList = null;
       this.networkType = -1;
    }
}
