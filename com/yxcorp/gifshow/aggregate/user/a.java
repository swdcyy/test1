package com.yxcorp.gifshow.aggregate.user.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import xwb.c;
import com.yxcorp.gifshow.permission.ContactPermissionHolder;
import xwb.b;
import xwb.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import y59.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import com.yxcorp.gifshow.activity.GifshowActivity;
import g69.b;
import java.lang.Runnable;
import brd.t;
import com.yxcorp.gifshow.upload.r;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;

public class a extends PresenterV2	// class@001937
{
    public final c p;
    public final ContactPermissionHolder q;
    public boolean r;

    public void a(){
       super();
       c uoc = new c();
       this.p = uoc;
       this.q = new ContactPermissionHolder(new b(uoc));
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       if (this.getActivity() != null && this.r == null) {
          boolean b = true;
          this.r = b;
          if (this.q.c()) {
             this.P8();
          }else if(a.a()){
             return;
          }else {
             SharedPreferences$Editor uEditor = a.a.edit();
             uEditor.putBoolean("aggregate_use_contact_before", b);
             g.a(uEditor);
             this.q.h(this.getActivity(), new b(this));
          }
       }
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.X7(r.b().subscribe(Functions.d(), Functions.d()));
       return;
    }
}
