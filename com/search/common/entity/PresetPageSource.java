package com.search.common.entity.PresetPageSource;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class PresetPageSource extends Enum	// class@000b84
{
    public int mPageSource;
    public static final PresetPageSource[] $VALUES;
    public static final PresetPageSource DEFAULT;

    static {
       PresetPageSource presetPageSo = new PresetPageSource("DEFAULT", 0, 1);
       PresetPageSource.DEFAULT = presetPageSo;
       PresetPageSource[] presetPageSo1 = new PresetPageSource[]{presetPageSo};
       PresetPageSource.$VALUES = presetPageSo1;
    }
    public void PresetPageSource(String p0,int p1,int p2){
       super(p0, p1);
       this.mPageSource = p2;
    }
    public static PresetPageSource valueOf(String p0){
       return Enum.valueOf(PresetPageSource.class, p0);
    }
    public static PresetPageSource[] values(){
       return PresetPageSource.$VALUES.clone();
    }
}
