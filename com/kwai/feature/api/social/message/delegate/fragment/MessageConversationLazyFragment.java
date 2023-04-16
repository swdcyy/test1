package com.kwai.feature.api.social.message.delegate.fragment.MessageConversationLazyFragment;
import hka.l;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import io.reactivex.subjects.PublishSubject;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Boolean;
import com.kwai.feature.api.social.message.delegate.fragment.c;
import lnc.c3$a;
import lnc.c3;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import i2b.a;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import wv5.c;
import erd.g;
import wv5.g;
import erd.r;
import wv5.d;
import com.kwai.feature.api.social.message.delegate.fragment.b;
import brd.w;
import wv5.f;
import com.kwai.feature.api.social.message.delegate.fragment.f;
import erd.o;
import com.kwai.feature.api.social.message.delegate.fragment.a;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import gr8.c;
import brd.x;
import com.kwai.feature.api.social.message.delegate.fragment.d;
import io.reactivex.internal.functions.Functions;
import crd.b;
import java.lang.StringBuilder;
import com.kwai.social.config.utils.HoldoutConfigUtilKt;
import tkd.b;
import tkd.d;
import rx5.c;
import ak5.j;

public class MessageConversationLazyFragment extends LazyInitSupportedFragment implements l	// class@001144
{
    public BaseFragment s;
    public boolean t;
    public c u;
    public l v;
    public final c w;
    public boolean x;
    public b y;
    public static final int z;

    public void MessageConversationLazyFragment(){
       super();
       this.w = PublishSubject.g();
    }
    public int Lb(){
       return 0;
    }
    public int M(){
       return 1;
    }
    public ClientContent$ContentPackage Q3(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, MessageConversationLazyFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.s != null && this.s.isAdded()) {
          objArray = this.s.Q3();
       }
       return objArray;
    }
    public boolean S0(){
       MessageConversationLazyFragment obj = PatchProxy.apply(null, this, MessageConversationLazyFragment.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.v;
       boolean b = (obj != null && obj.S0())? true: false;
       return b;
    }
    public boolean S1(){
       MessageConversationLazyFragment obj = PatchProxy.apply(null, this, MessageConversationLazyFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.v;
       boolean b = (obj != null && obj.S1())? true: false;
       return b;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, MessageConversationLazyFragment.class, "13")) {
          return;
       }
       c3.c(this.v, c.a);
       return;
    }
    public void c0(){
       if (PatchProxy.applyVoid(null, this, MessageConversationLazyFragment.class, "3")) {
          return;
       }
       if (this.s != null) {
          this.s.bh(false);
       }
       return;
    }
    public View eh(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, MessageConversationLazyFragment.class, "4");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d08da, p1, false);
    }
    public int f(){
       return 6;
    }
    public void fh(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MessageConversationLazyFragment.class, "5")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, MessageConversationLazyFragment.class, "6")) {
          t.merge(this.m().doOnNext(new c(this)).filter(new g(this)), this.hh().doOnNext(new d(this)).filter(b.b), this.w.hide()).filter(new f(this)).flatMap(new f(this)).filter(a.b).cast(BaseFragment.class).take(1).compose(c.c(this.m(), FragmentEvent.DESTROY)).subscribe(new d(this), Functions.d());
       }
       return;
    }
    public int getPage(){
       return 28;
    }
    public String getPageParams(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Bundle obj = PatchProxy.apply(null, this, MessageConversationLazyFragment.class, "10");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (this.s != null && this.s.isAdded()) {
          return this.s.getPageParams();
       }
       obj = this.getArguments();
       String str = (obj != null)? obj.getString("key_im_subbiz"): "0";
       StringBuilder str1 = "page_style=im&sub_biz="+str+"&page_version=";
       Object obj1 = PatchProxy.apply(null, null, MessageConversationLazyFragment.class, "11");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(!HoldoutConfigUtilKt.a() && d.a(0x77cfa10c).Ih()){
          b = true;
       }else {
          b = false;
       }
       String str2 = (b)? "new": "old";
       return str1+str2+"&needRefreshPageParams=true";
    }
    public boolean i0(){
       MessageConversationLazyFragment obj = PatchProxy.apply(null, this, MessageConversationLazyFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.v;
       boolean b = (obj != null && obj.i0())? true: false;
       return b;
    }
    public boolean lh(){
       return true;
    }
    public boolean n5(){
       MessageConversationLazyFragment obj = PatchProxy.apply(null, this, MessageConversationLazyFragment.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.v;
       boolean b = (obj != null && obj.n5())? true: false;
       return b;
    }
    public String o(){
       return "MESSAGE";
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MessageConversationLazyFragment.class, "1")) {
          return;
       }
       if (p0 != null) {
          p0.clear();
       }
       j.o().d();
       super.onCreate(p0);
       return;
    }
    public void u(){
       if (PatchProxy.applyVoid(null, this, MessageConversationLazyFragment.class, "2")) {
          return;
       }
       if (this.s != null) {
          this.s.bh(true);
       }
       return;
    }
    public boolean u2(){
       MessageConversationLazyFragment obj = PatchProxy.apply(null, this, MessageConversationLazyFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.v;
       boolean b = (obj != null && obj.u2())? true: false;
       return b;
    }
    public boolean x0(){
       MessageConversationLazyFragment obj = PatchProxy.apply(null, this, MessageConversationLazyFragment.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.v;
       boolean b = (obj != null && obj.x0())? true: false;
       return b;
    }
}
