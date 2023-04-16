package com.yxcorp.gifshow.hot.stagger.secondfloor.fragment.TopicSquareFragmentRn;
import lnc.g2$a;
import im8.g;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.hot.stagger.secondfloor.fragment.TopicSquareFragmentRn$a;
import nsd.u;
import b9c.b0;
import b9c.w;
import b9c.a;
import b9c.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import uva.j0;
import tva.c;
import java.util.Map;
import java.util.HashMap;
import android.os.Bundle;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import im8.c;
import lnc.g2;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import kotlin.jvm.internal.a;
import ag6.a;

public final class TopicSquareFragmentRn extends BaseFragment implements g2$a, g	// class@0018d2
{
    public View j;
    public g2 k;
    public PublishSubject l;
    public static final TopicSquareFragmentRn$a m;

    static {
       TopicSquareFragmentRn.m = new TopicSquareFragmentRn$a(null);
    }
    public void TopicSquareFragmentRn(){
       super(null, null, null, null, 15, null);
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, TopicSquareFragmentRn.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new j0());
       PatchProxy.onMethodExit(TopicSquareFragmentRn.class, "4");
       return obj;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TopicSquareFragmentRn.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new c();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, TopicSquareFragmentRn.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(TopicSquareFragmentRn.class, new c());
       }else {
          obj.put(TopicSquareFragmentRn.class, null);
       }
       return obj;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TopicSquareFragmentRn.class, "3")) {
          return;
       }
       super.onActivityCreated(p0);
       TopicSquareFragmentRn tk = this.k;
       if (tk != null) {
          Object[] objArray = new Object[]{this,new PhotoDetailParam(),new c("FRAGMENT", this)};
          tk.b(objArray);
       }
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TopicSquareFragmentRn.class, "2")) {
          return;
       }
       super.onCreate(p0);
       if (this.k == null) {
          this.k = new g2(this, this);
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, TopicSquareFragmentRn.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "inflater");
       super.onCreateView(p0, p1, p2);
       if (this.j == null) {
          this.j = a.c(p0, 0x7f0d1628, p1, false);
       }
       return this.j;
    }
}
