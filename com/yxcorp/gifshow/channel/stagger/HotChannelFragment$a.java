package com.yxcorp.gifshow.channel.stagger.HotChannelFragment$a;
import yv8.c;
import com.yxcorp.gifshow.channel.stagger.HotChannelFragment;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import sj9.a;
import com.kwai.framework.model.channel.HotChannel;
import java.lang.CharSequence;
import android.text.TextUtils;

public class HotChannelFragment$a implements c	// class@001058
{
    public final HotChannelFragment b;

    public void HotChannelFragment$a(HotChannelFragment p0){
       this.b = p0;
       super();
    }
    public String bizType(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       HotChannelFragment obj = PatchProxy.apply(objArray, this, HotChannelFragment$a.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.b.N;
       String str = PatchProxy.applyOneRefs(obj, objArray, a.class, "1");
       if (str != patchProxyRe) {
       }else {
          str = "HOT_CHANNEL";
          str = (TextUtils.isEmpty(obj.mSubChannelId))? str.concat(obj.mId): ((str.concat(obj.mId)).concat("SUB")).concat(obj.mSubChannelId);
       }
       return str;
    }
}
