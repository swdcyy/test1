package com.kuaishou.android.live.model.VoicePartyChannel;
import java.io.Serializable;
import java.lang.Object;
import sp.f;
import ok.x;
import com.google.common.base.Suppliers;
import sp.g;
import java.lang.Integer;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.graphics.Color;
import java.lang.StringBuilder;

public class VoicePartyChannel implements Serializable	// class@000837
{
    public x b;
    public x c;
    public int id;
    public String mDescription;
    public String mEndColor;
    public CDNUrl[] mIconUrls;
    public String mName;
    public CDNUrl[] mPictureUrls;
    public CDNUrl[] mSelectedIconUrls;
    public String mStartColor;
    public int mType;
    public static final long serialVersionUID = 0x1bf7b33aab261910;

    public void VoicePartyChannel(){
       super();
       this.b = Suppliers.a(new f(this));
       this.c = Suppliers.a(new g(this));
    }
    public static Integer a(VoicePartyChannel p0){
       return p0.c();
    }
    public static Integer b(VoicePartyChannel p0){
       return p0.d();
    }
    private Integer c(){
       return Integer.valueOf(this.e(this.mStartColor));
    }
    private Integer d(){
       return Integer.valueOf(this.e(this.mEndColor));
    }
    public final int e(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VoicePartyChannel.class, "3");
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
       Object obj = PatchProxy.apply(null, this, VoicePartyChannel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.c.get().intValue();
    }
    public int getStartColor(){
       Object obj = PatchProxy.apply(null, this, VoicePartyChannel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.get().intValue();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, VoicePartyChannel.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "VoicePartyChannel{id="+this.id+", mName=\'"+this.mName+'''+", mStartColor=\'"+this.mStartColor+'''+", mEndColor=\'"+this.mEndColor+'''+", mType="+this.mType+'}';
    }
}
