package com.kuaishou.live.core.show.redpacket.redpackrain2.model.LiveRedPackRainResource$RedPackRainText;
import java.io.Serializable;
import mkd.a;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.LiveRedPackRainMessage$RedPackRainText;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Integer;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class LiveRedPackRainResource$RedPackRainText implements Serializable, a	// class@000f08
{
    public String mText;
    public int mTextColor;
    public String mTextColorStr;
    public static final long serialVersionUID = 0x2e2424c319263fa7;

    public void LiveRedPackRainResource$RedPackRainText(){
       super();
    }
    public static LiveRedPackRainResource$RedPackRainText fromSCMessage(LiveRedPackRainMessage$RedPackRainText p0){
       Object obj = null;
       LiveRedPackRainResource$RedPackRainText obj1 = PatchProxy.applyOneRefs(p0, obj, LiveRedPackRainResource$RedPackRainText.class, "2");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 == null) {
          return obj;
       }
       obj1 = new LiveRedPackRainResource$RedPackRainText();
       obj1.mText = p0.content;
       obj1.mTextColorStr = p0.color;
       obj1.afterDeserialize();
       return obj1;
    }
    public static int parseColor(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveRedPackRainResource$RedPackRainText.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return LiveRedPackRainResource$RedPackRainText.parseColor(p0, 0);
    }
    public static int parseColor(String p0,int p1){
       Object[] obj;
       if (PatchProxy.isSupport(LiveRedPackRainResource$RedPackRainText.class)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, LiveRedPackRainResource$RedPackRainText.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (TextUtils.x(p0)) {
          return p1;
       }else if(!p0.startsWith("#")){
          obj = new Object[]{p0};
          p0 = String.format("#%s", obj);
       }
       int i = TextUtils.J(p0, p1);
       if (i) {
          p1 = i;
       }
       return p1;
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, LiveRedPackRainResource$RedPackRainText.class, "1")) {
          return;
       }
       this.mTextColor = LiveRedPackRainResource$RedPackRainText.parseColor(this.mTextColorStr);
       return;
    }
}
