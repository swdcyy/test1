package com.kwai.robust.PatchesInfo;
import java.util.Map;

public interface abstract PatchesInfo	// class@0013fb
{
    public static final String METHOD_NAME_getPatch = "getPatch";
    public static final String METHOD_NAME_onApplied = "onApplied";
    public static final String METHOD_NAME_onRollback = "onRollback";
    public static final String METHOD_NAME_setup = "setup";

    Map getPatch();
    void onApplied(boolean p0);
    void onRollback();
    void setup();
}
