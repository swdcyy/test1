package com.kuaishou.live.core.voiceparty.crossroompk.resource.a;
import ia1.b;
import com.kuaishou.live.core.voiceparty.crossroompk.resource.VoicePartyCrossRoomPkSkinResource;
import java.lang.String;
import hc.b;
import java.lang.Object;
import ia1.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.widget.ImageView;
import java.lang.Boolean;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import d61.c0;
import com.facebook.drawee.view.SimpleDraweeView;
import boc.d0;
import com.kuaishou.live.core.voiceparty.crossroompk.log.LiveVoicePartyPKLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import hc.a;
import fr2.a;
import java.lang.Runnable;
import ekd.k1;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.Enum;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$LiveResourceFileType;
import java.lang.StringBuilder;
import java.io.File;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil;
import com.kuaishou.live.common.core.component.pk.b;

public class a implements b	// class@00147f
{
    public final VoicePartyCrossRoomPkSkinResource a;
    public final String b;
    public final b c;

    public void a(VoicePartyCrossRoomPkSkinResource p0,String p1,b p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public String a(){
       return a.b(this);
    }
    public int b(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.getBackUpDrawableRes();
    }
    public void c(ImageView p0){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "3")) {
          return;
       }
       Object obj = PatchProxy.applyOneRefs(p0, this, uoa, "5");
       boolean b = true;
       if (obj != patchProxyRe) {
          b1 = obj.booleanValue();
       }else if(p0 == null || this.a.getBackUpDrawableRes() == -1){
          b1 = false;
       }else {
          p0.setImageResource(this.a.getBackUpDrawableRes());
          this.i();
          b1 = true;
       }
       if (p0 instanceof KwaiImageView && !b1) {
          obj = p0;
          Object obj1 = PatchProxy.applyOneRefs(obj, this, uoa, "6");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else if(obj == null || TextUtils.x(this.a.getBackUpCdnUrl())){
             b = false;
          }else {
             d0.d(obj, c0.a.b(this.a.getBackUpCdnUrl()));
             this.i();
          }
          if (!b) {
             b.c0(LiveVoicePartyPKLogTag.TAG, "[LiveCrossRoomPkResource][onFallBack]", "imageView:", p0);
          }
       }
    label_007f :
       return;
    }
    public boolean d(){
       return a.e(this);
    }
    public String e(){
       return a.a(this);
    }
    public String f(){
       return this.b;
    }
    public String g(){
       Object obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getLocalFileResPath();
    }
    public boolean h(){
       return a.d(this);
    }
    public final void i(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "10")) {
          return;
       }
       a tc = this.c;
       if (tc != null) {
          tc.e(objArray);
          k1.r(new a(this), 3000);
       }
       return;
    }
    public boolean isValid(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, uoa, "2");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.apply(objArray, this, uoa, "7");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(TextUtils.x(this.a.getLocalFileResPath())){
          b.J(LiveLogTag.PK, "LiveCrossRoomPkResource checkResourceValid resource empty", ImmutableMap.of("type", this.a.toString()));
       }else {
          LiveResourceFileUtil$LiveResourceFileType obj1 = PatchProxy.apply(objArray, this, uoa, "8");
          boolean b1 = (obj1 != patchProxyRe)? obj1.booleanValue(): TextUtils.x(this.a.getLocalFileResPath());
          if (b1) {
             b.J(LiveLogTag.PK, "LiveCrossRoomPkResource checkResourceValid resource disable", ImmutableMap.of("type", this.a.toString()));
          }else {
             obj1 = LiveResourceFileUtil$LiveResourceFileType.LIVE_PK_RESOURCE;
             obj = this.a.getLocalFileResPath();
             String str = PatchProxy.applyOneRefs(obj, this, uoa, "9");
             if (str != patchProxyRe) {
             }else {
                str = this.b+"/"+obj;
             }
             File uFile = LiveResourceFileUtil.j(obj1, str);
             b = (uFile != null && uFile.exists())? true: false;
             if (!b) {
                b.J(LiveLogTag.PK, "LiveCrossRoomPkResource checkResourceValid file empty or file not exits", ImmutableMap.of("type", this.a.toString(), "path", this.a.getLocalFileResPath()));
                b.h();
             }
          }
       }
       b = false;
       return b;
    }
}
