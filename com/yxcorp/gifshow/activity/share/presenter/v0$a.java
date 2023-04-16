package com.yxcorp.gifshow.activity.share.presenter.v0$a;
import com.kwai.library.widget.button.SlipSwitchButton$a;
import com.yxcorp.gifshow.activity.share.presenter.v0;
import k2b.e0;
import java.lang.Object;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import iz6.a;
import java.lang.StringBuilder;
import jq.a;
import vw8.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import ow8.c;
import android.content.SharedPreferences;
import oe6.n;
import android.content.SharedPreferences$Editor;
import com.yxcorp.gifshow.util.PostUtils;
import oe6.g;

public class v0$a implements SlipSwitchButton$a	// class@001439
{
    public final e0 b;
    public final v0 c;

    public void v0$a(v0 p0,e0 p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void r(SlipSwitchButton p0,boolean p1,boolean p2){
       v0$a this;
       if (PatchProxy.isSupport(v0$a.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, v0$a.class, "1")) {
          return;
       }
       a.a(this, p0, p1, p2);
       int i = 0;
       Object[] objArray = new Object[i];
       a.c("ShareJudgeAssistPresenter", "onSwitchChanged\(\) isOpened="+p1+" isManualClick="+p2, objArray);
       if (!p2) {
          return;
       }
       this = this.b;
       p0 = null;
       if (this != null) {
          a uoa = a.class;
          if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(this, Boolean.valueOf(p1), p0, uoa, "3")) {
             objArray = new Object[i];
             a.c("PublishLogger", "logToggleJudgeAssistSwitch\(\) open="+p1, objArray);
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "JUDGE_ASSISTANT";
             JsonObject jsonObject = new JsonObject();
             String str = (p1)? "open": "close";
             jsonObject.c0("button_status", str);
             uElementPack.params = jsonObject.toString();
             u1.M("3721825", this, 1, uElementPack, null, null);
          }
       }
       c uoc = c.class;
       if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p1), p0, uoc, "5")) {
          Object[] objArray1 = new Object[i];
          a.c("SharePageUtils", "setShareJudgeAssist\(\) "+p1, objArray1);
          g.a(n.b().edit().putBoolean(PostUtils.s("share_judge_assist_open"), p1));
       }
       return;
    }
}
