package com.yxcorp.gifshow.record.album.RecordDraftFragment;
import mm6.c;
import com.yxcorp.gifshow.record.album.LocalAlbumFragmentV2;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lq.i;
import lq.e;
import mm6.b;
import com.yxcorp.gifshow.record.album.LocalAlbumFragment;
import com.yxcorp.gifshow.record.album.LocalAlbumListFragment;
import android.app.Activity;
import android.view.View;
import android.widget.RelativeLayout;
import com.yxcorp.utility.n;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import lnc.a1;
import sm6.b;
import android.content.res.Resources;
import cw9.c;
import java.util.Map;
import android.graphics.drawable.Drawable;
import java.lang.Boolean;
import mm6.a;
import android.view.KeyEvent;
import hka.d;
import hka.c;

public class RecordDraftFragment extends LocalAlbumFragmentV2 implements c	// class@00170a
{

    public void RecordDraftFragment(){
       super();
    }
    public String Bh(){
       Object obj = PatchProxy.apply(null, this, RecordDraftFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!i.h()) {
          return null;
       }
       return i.m().k().c();
    }
    public int Ff(){
       return b.c(this);
    }
    public int S5(){
       return b.d(this);
    }
    public String Xa(){
       return b.e(this);
    }
    public boolean a4(){
       return b.b(this);
    }
    public void ch(){
       if (PatchProxy.applyVoid(null, this, RecordDraftFragment.class, "3")) {
          return;
       }
       super.ch();
       LocalAlbumFragment tq = this.q;
       if (tq != null) {
          tq.H = true;
       }
       return;
    }
    public void dg(Activity p0){
       b.a(this, p0);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordDraftFragment.class, "1")) {
          return;
       }
       super.doBindView(p0);
       View[] viewArray = new View[]{this.o.findViewById(0x7f0a3670)};
       n.Z(8, viewArray);
       FragmentActivity activity = this.getActivity();
       if (activity != null && p0 != null) {
          p0.setBackgroundColor(a1.a(R.color.arg_RES_7f06018d));
          p0.setPadding(0, b.p(activity, p0), 0, (c.b(activity.getResources(), R.dimen.arg_RES_7f07013b) + b.j(activity)));
       }
       return;
    }
    public String f8(){
       Object obj = PatchProxy.apply(null, this, RecordDraftFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.Bh();
    }
    public boolean f9(){
       return b.f(this);
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RecordDraftFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(RecordDraftFragment.class, null);
       return objectsByTag;
    }
    public int hh(){
       return 2;
    }
    public Drawable i9(){
       return b.i(this);
    }
    public boolean lf(){
       return b.h(this);
    }
    public boolean onBackPressed(){
       FragmentActivity obj = PatchProxy.apply(null, this, RecordDraftFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (super.onBackPressed()) {
          return true;
       }
       obj = this.getActivity();
       if (obj == null) {
          return false;
       }
       if (obj instanceof a) {
          obj.A0();
       }
       return true;
    }
    public boolean onKeyDown(int p0,KeyEvent p1){
       return c.a(this, p0, p1);
    }
    public boolean onKeyUp(int p0,KeyEvent p1){
       return c.b(this, p0, p1);
    }
    public boolean re(){
       return b.g(this);
    }
    public boolean x2(){
       return true;
    }
}
