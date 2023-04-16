package mq9.a;
import cm5.a;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import mq9.h;
import tkd.b;
import tkd.d;
import cm5.b;
import cm5.c;
import android.content.Context;
import erd.g;
import com.kwai.framework.plugin.downloader.PluginDownloadExtension;
import mq9.a$b;
import cm5.d;
import crd.b;
import androidx.fragment.app.Fragment;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.corona.common.plugin.fragment.CoronaAdProxyPlayerFragment;
import com.kwai.framework.model.channel.HotChannel;
import ul5.e;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Boolean;
import vl5.b;
import vl5.c;
import vl5.e;
import com.yxcorp.gifshow.corona.common.plugin.fragment.CoronaTVBiFeedsProxyFragment;
import android.app.Activity;
import k2b.e0;
import mq9.a$c;
import ul5.g;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import mq9.a$d;
import com.yxcorp.gifshow.corona.common.plugin.fragment.CoronaSearchResultProxyFragment;
import java.util.List;
import java.util.ArrayList;
import msd.l;
import com.kwai.framework.activitycontext.ActivityContext;
import mq9.a$a;

public class a implements a	// class@00306d
{

    public void a(){
       super();
    }
    public void Lf(QPhoto p0,String p1,String p2,int p3){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), this, a.class, "2")) {
          return;
       }
       a.p(p0, "photo");
       if (!h.a()) {
          return;
       }
       d.a(0x822e1c2).Lf(p0, p1, p2, p3);
       return;
    }
    public void Mp(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "9")) {
          return;
       }
       if (!h.a()) {
          return;
       }
       d.a(-241623919).Mp(p0);
       return;
    }
    public void Tg(Context p0,g p1,g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "12")) {
          return;
       }
       a.p(p1, "callBack");
       a.p(p2, "error");
       if (h.a()) {
          d.a(-241623919).Tg(p0, p1, p2);
          return;
       }else {
          PluginDownloadExtension.k.s("corona_core_plugin", 40);
          h.b(new a$b(p0, p1, p2));
          return;
       }
    }
    public Fragment W30(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "photo");
       if (!h.a()) {
          return new CoronaAdProxyPlayerFragment(p0);
       }
       Fragment uFragment = d.a(0x822e1c2).W30(p0);
       a.o(uFragment, "PluginManager.get\(Corona¡­etAdPlayerFragment\(photo\)");
       return uFragment;
    }
    public BaseFragment XR(HotChannel p0,String p1,boolean p2,e p3){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Boolean.valueOf(p2), p3, this, a.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p3, "param");
       boolean b = h.a();
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(p3, Boolean.valueOf(b), this, uoa, "6")) {
          String str = p3.a();
          Boolean uBoolean = Boolean.valueOf(b);
          if (PatchProxy.applyVoidThreeRefs(str, "pluginInstalled", uBoolean, null, b.class, "3") || (uBoolean != null && str != null)) {
             c uoc = e.a(str);
             if (uoc != null) {
                uoc.a("pluginInstalled", uBoolean);
             }
          }
          b.c(p3.a(), "CHECK_PLUGIN_INSTALLED");
       }
       if (b) {
          p3.c = false;
          BaseFragment uBaseFragmen = d.a(-241623919).XR(p0, p1, p2, p3);
          a.o(uBaseFragmen, "PluginManager.get\(Corona¡­om,\n        param\n      \)");
          return uBaseFragmen;
       }else {
          return new CoronaTVBiFeedsProxyFragment(p0, p1, p2, p3);
       }
    }
    public void dw(QPhoto p0,Activity p1,e0 p2,boolean p3){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, a.class, "8")) {
          return;
       }
       if (p1 == null) {
          return;
       }
       h.c(p1, new a$c(p0, p1, p2, p3));
       return;
    }
    public void fQ(Activity p0,g p1,PopupInterface$h p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "4")) {
          return;
       }
       a.p(p0, "callerActivity");
       a.p(p1, "panelParams");
       h.c(p0, new a$d(p0, p1, p2));
       return;
    }
    public BaseFragment fu(){
       BaseFragment obj = PatchProxy.apply(null, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!h.a()) {
          return new CoronaSearchResultProxyFragment();
       }
       obj = d.a(-241623919).fu();
       a.o(obj, "PluginManager.get\(Corona¡­deoSearchResultFragment\(\)");
       return obj;
    }
    public boolean i30(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!h.a()) {
          return false;
       }
       return d.a(0x822e1c2).i30(p0);
    }
    public boolean isAvailable(){
       return true;
    }
    public List jA(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!h.a()) {
          return new ArrayList();
       }
       p0 = d.a(-241623919).jA(p0);
       a.o(p0, "PluginManager.get\(Corona¡­otoPlayDuration\(photoIds\)");
       return p0;
    }
    public void yk(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "10")) {
          return;
       }
       a.p(p0, "callBack");
       ActivityContext uActivityCon = ActivityContext.g();
       a.o(uActivityCon, "ActivityContext.getInstance\(\)");
       Activity uActivity = uActivityCon.e();
       if (uActivity != null) {
          h.c(uActivity, new a$a(p0));
       }
       return;
    }
}
