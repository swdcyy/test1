package com.yxcorp.gifshow.album.viewbinder.AbsPreviewFragmentViewBinder;
import com.yxcorp.gifshow.base.fragment.IPreviewViewBinder;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.ViewModel;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.base.fragment.IPreviewViewBinder$a;
import j79.l0;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import ga9.b;
import ec7.a;
import java.util.List;
import java.lang.Integer;
import android.widget.TextView;
import com.yxcorp.gifshow.album.preview.PreviewViewPager;

public abstract class AbsPreviewFragmentViewBinder implements IPreviewViewBinder	// class@001ad3
{
    public TextView a;
    public View b;
    public View c;
    public View d;
    public PreviewViewPager e;
    public View f;
    public AbsPreviewSelectViewBinder g;
    public final Fragment h;
    public final int i;

    public void AbsPreviewFragmentViewBinder(Fragment p0,int p1){
       a.q(p0, "fragment");
       super();
       this.h = p0;
       this.i = p1;
    }
    public boolean a(ViewModel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AbsPreviewFragmentViewBinder.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return IPreviewViewBinder$a.b(this, p0);
    }
    public boolean b(l0 p0){
       AbsPreviewFragmentViewBinder obj = PatchProxy.applyOneRefs(p0, this, AbsPreviewFragmentViewBinder.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.g;
       if (obj != null) {
          obj.b(p0);
       }
       return false;
    }
    public void d(RecyclerView$ViewHolder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AbsPreviewFragmentViewBinder.class, "6")) {
          return;
       }
       a.q(p0, "viewHolder");
       IPreviewViewBinder$a.c(this, p0);
       return;
    }
    public void e(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AbsPreviewFragmentViewBinder.class, "2")) {
          return;
       }
       a.q(p0, "rootView");
       AbsPreviewFragmentViewBinder tg = this.g;
       if (tg != null) {
          tg.e(p0);
       }
       return;
    }
    public void i(a p0,int p1,List p2,ViewModel p3){
       if (PatchProxy.isSupport(AbsPreviewFragmentViewBinder.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, AbsPreviewFragmentViewBinder.class, "7")) {
          return;
       }
       a.q(p0, "adapter");
       a.q(p2, "payloads");
       IPreviewViewBinder$a.a(this, p0, p1, p2, p3);
       return;
    }
    public final TextView j(){
       return this.a;
    }
    public final View k(){
       return this.b;
    }
    public final View l(){
       return this.c;
    }
    public final View m(){
       return this.d;
    }
    public final Fragment n(){
       return this.h;
    }
    public final View o(){
       return this.f;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, AbsPreviewFragmentViewBinder.class, "4")) {
          return;
       }
       AbsPreviewFragmentViewBinder tg = this.g;
       if (tg != null) {
          tg.onDestroy();
       }
       return;
    }
    public final PreviewViewPager p(){
       return this.e;
    }
    public final void q(TextView p0){
       this.a = p0;
    }
    public final void r(View p0){
       this.b = p0;
    }
    public final void s(View p0){
       this.c = p0;
    }
    public final void t(View p0){
       this.d = p0;
    }
    public final void u(View p0){
       this.f = p0;
    }
    public final void v(PreviewViewPager p0){
       this.e = p0;
    }
}
