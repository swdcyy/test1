package com.kuaishou.android.live.model.VoicePartyMeta$VoicePartyFeedBackgroundColor;
import java.io.Serializable;
import java.lang.Object;
import sp.h;
import ok.x;
import com.google.common.base.Suppliers;
import sp.i;
import java.lang.Integer;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.graphics.Color;

public class VoicePartyMeta$VoicePartyFeedBackgroundColor implements Serializable	// class@00083b
{
    public x b;
    public x c;
    public String mEndColor;
    public String mStartColor;
    public static final long serialVersionUID = 0x4b60f8c5a7030e3c;

    public void VoicePartyMeta$VoicePartyFeedBackgroundColor(){
       super();
       this.b = Suppliers.a(new h(this));
       this.c = Suppliers.a(new i(this));
    }
    public static Integer a(VoicePartyMeta$VoicePartyFeedBackgroundColor p0){
       return p0.c();
    }
    public static Integer b(VoicePartyMeta$VoicePartyFeedBackgroundColor p0){
       return p0.d();
    }
    private Integer c(){
       return Integer.valueOf(this.e(this.mStartColor));
    }
    private Integer d(){
       return Integer.valueOf(this.e(this.mEndColor));
    }
    public final int e(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VoicePartyMeta$VoicePartyFeedBackgroundColor.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       try{
          return Color.parseColor(p0);
       }catch(java.lang.Exception e0){
          return 0xff000000;
       }
    }
    public int getEndColor(){
       Object obj = PatchProxy.apply(null, this, VoicePartyMeta$VoicePartyFeedBackgroundColor.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.c.get().intValue();
    }
    public int getStartColor(){
       Object obj = PatchProxy.apply(null, this, VoicePartyMeta$VoicePartyFeedBackgroundColor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.get().intValue();
    }
}
