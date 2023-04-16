package com.kwai.video.clipkit.config.EditorEncodeConfig$FallBackCondition;
import java.lang.Object;

public class EditorEncodeConfig$FallBackCondition	// class@001a64
{
    public double maxProcessCpuUsage;
    public double maxProcessMemorySizeKb;
    public double maxStutterPerSecond;
    public int minAvgFps;
    public int minScreenHeight;
    public int minScreenWidth;
    public double supportNetWork;

    public void EditorEncodeConfig$FallBackCondition(){
       super();
       this.minScreenWidth = 720;
       this.minScreenHeight = 1280;
       this.minAvgFps = 20;
       this.maxStutterPerSecond = 0x3fb999999999999a;
       this.maxProcessMemorySizeKb = 0x4118dbf000000000;
       this.maxProcessCpuUsage = 56.00f;
       this.supportNetWork = 15.00f;
    }
}
