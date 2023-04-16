package com.kwai.video.westeros.stentorplugin.AsrConfig;
import java.lang.String;
import java.lang.Object;
import com.kwai.video.westeros.stentorplugin.AsrConfig$AsrControl;

public class AsrConfig	// class@0010b9
{
    public AsrConfig$AsrControl control;
    public String messageCommand;
    public String receiveCommand;
    public String requestMode;
    public int timeOutInSecond;

    public void AsrConfig(int p0,String p1,int p2,String p3,String p4){
       super();
       this.control = AsrConfig$AsrControl.values()[p0];
       this.requestMode = p1;
       this.timeOutInSecond = p2;
       this.messageCommand = p3;
       this.receiveCommand = p4;
    }
}
