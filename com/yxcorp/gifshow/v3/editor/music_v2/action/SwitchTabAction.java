package com.yxcorp.gifshow.v3.editor.music_v2.action.SwitchTabAction;
import xvc.b;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.music.vb.SwitchTab;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class SwitchTabAction extends b	// class@00108b
{
    public final SwitchTab tab;

    public void SwitchTabAction(SwitchTab p0){
       a.p(p0, "tab");
       super();
       this.tab = p0;
    }
    public final SwitchTab getTab(){
       return this.tab;
    }
}
