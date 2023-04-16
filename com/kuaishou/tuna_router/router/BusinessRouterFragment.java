package com.kuaishou.tuna_router.router.BusinessRouterFragment;
import lnc.g2$a;
import im8.g;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import p25.f;
import p25.i;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import p25.h;
import java.util.Iterator;
import java.util.Set;
import p25.g;
import android.net.Uri;
import com.kuaishou.tuna_logger.KsLogTunaCoreTag;
import java.util.List;
import p25.a;
import msd.a;
import c15.b;
import com.kuaishou.tuna_router.router.a;
import p25.d;
import java.util.Map;
import java.util.HashMap;
import android.os.Bundle;
import lnc.g2;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import s25.c$a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Number;
import i2b.a;

public class BusinessRouterFragment extends BaseFragment implements g2$a, g	// class@00117e
{
    public f j;
    public g2 k;
    public Uri l;
    public static final int m;

    public void BusinessRouterFragment(){
       super();
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, BusinessRouterFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       f uof = this.dh();
       if (uof != null) {
          obj.U7(uof.a());
       }
       PatchProxy.onMethodExit(BusinessRouterFragment.class, "5");
       return obj;
    }
    public final void ch(){
       if (PatchProxy.applyVoid(null, this, BusinessRouterFragment.class, "7")) {
          return;
       }
       FragmentActivity activity = this.getActivity();
       if (activity != null && !activity.isFinishing()) {
          activity.finish();
       }
       return;
    }
    public final f dh(){
       f obj = PatchProxy.apply(null, this, BusinessRouterFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       if (this.j == null) {
          Iterator iterator = h.a.iterator();
          while (true) {
             if (iterator.hasNext()) {
                g og = iterator.next();
                if (og.a(this.l)) {
                   this.j = og.build();
                   obj = 1;
                }
             }
             String str = "getBusinessRouterParser";
             if (obj != null) {
                b.f(KsLogTunaCoreTag.TUNA_CLOG.appendTag(str), new a(this));
                break ;
             }else {
                b.f(KsLogTunaCoreTag.TUNA_CLOG.appendTag(str), a.b);
                this.ch();
                break ;
             }
          }
       }
       return this.j;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BusinessRouterFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new d();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, BusinessRouterFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(BusinessRouterFragment.class, new d());
       }else {
          obj.put(BusinessRouterFragment.class, null);
       }
       return obj;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BusinessRouterFragment.class, "4")) {
          return;
       }
       super.onActivityCreated(p0);
       if (this.k == null) {
          this.k = new g2(this, this);
       }
       Object[] objArray = new Object[]{this.l,this};
       this.k.b(objArray);
       return;
    }
    public void onCreate(Bundle p0){
       String str = "2";
       if (PatchProxy.applyVoidOneRefs(p0, this, BusinessRouterFragment.class, str)) {
          return;
       }
       super.onCreate(p0);
       p0 = this.getArguments();
       if (p0 != null) {
          String str1 = p0.getString("FRAGMENT_ARG_URI");
          if (!TextUtils.x(str1)) {
             h oh = h.class;
             if (!PatchProxy.applyVoid(null, null, oh, "1") && !PatchProxy.applyVoid(null, null, oh, str)) {
                h.a.add(new c$a());
             }
             this.l = Uri.parse(str1);
          }else {
             this.ch();
          }
       }else {
          this.ch();
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       int i;
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, BusinessRouterFragment.class, "3");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       p0 = PatchProxy.apply(null, this, BusinessRouterFragment.class, "6");
       if (p0 != PatchProxyResult.class) {
          i = p0.intValue();
       }else {
          f uof = this.dh();
          i = (uof != null)? uof.b(): 0;
          if (!i) {
             i = 0x7f0d03f9;
          }
       }
       return a.i(p1, i);
    }
}
