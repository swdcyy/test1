package com.kuaishou.live.audience.component.comments.editor.asr.b;
import im8.g;
import k51.c;
import com.kuaishou.live.audience.component.comments.editor.asr.b$a;
import com.kuaishou.live.audience.component.comments.editor.asr.b$b;
import com.kuaishou.live.audience.component.comments.editor.asr.b$c;
import com.kuaishou.live.audience.component.comments.editor.asr.b$d;
import com.kuaishou.live.audience.component.comments.editor.asr.b$e;
import com.kuaishou.live.audience.component.comments.editor.asr.b$f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dy0.e$a;
import dy0.e;
import ay0.b;
import android.view.View$OnClickListener;
import android.widget.TextView;
import ay0.c;
import android.text.TextWatcher;
import android.widget.EditText;
import l32.h;
import ay0.d;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import zx0.a;
import com.kuaishou.live.audience.component.comments.editor.LiveAsrFloatEditorFragment$e;
import java.util.Objects;
import com.kuaishou.live.audience.component.comments.editor.asr.LiveAsrInputRecordView;
import l32.u;
import java.lang.CharSequence;
import java.lang.Boolean;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import lnc.ja;
import t02.a0;
import com.kwai.video.waynelive.LivePlayerController;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import android.text.Editable;
import lnc.a1;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.widget.EmojiEditText;
import com.kwai.robust.PatchProxyResult;
import ay0.g;
import java.util.Map;
import java.util.HashMap;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;

public class b extends c implements g	// class@000aa7
{
    public String A;
    public boolean B;
    public boolean C;
    public boolean D;
    public long E;
    public h F;
    public final a G;
    public d H;
    public final u I;
    public TextWatcher J;
    public e$a K;
    public a0 p;
    public BaseEditorFragment q;
    public e r;
    public EmojiEditText s;
    public LiveAsrInputRecordView t;
    public TextView u;
    public TextView v;
    public TextView w;
    public h x;
    public LiveAsrFloatEditorFragment$e y;
    public String z;
    public static String sLivePresenterClassName = "LiveFloatEditorAsrPresenter";

    public void b(){
       super();
       this.B = false;
       this.C = false;
       this.D = false;
       this.F = new b$a(this);
       this.G = new b$b(this);
       this.H = new b$c(this);
       this.I = new b$d(this);
       this.J = new b$e(this);
       this.K = new b$f(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       this.r.b(this.K);
       this.v.setOnClickListener(new b(this));
       this.w.setOnClickListener(new c(this));
       this.s.addTextChangedListener(this.J);
       b tx = this.x;
       if (tx != null) {
          tx.h.observe(this.q, new d(this));
       }
       this.X8();
       this.y.a(this.G);
       return;
    }
    public void J8(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "7")) {
          return;
       }
       b = false;
       this.C = b;
       this.r.c(this.K);
       b tt = this.t;
       Objects.requireNonNull(tt);
       if (!PatchProxy.applyVoid(objArray, tt, LiveAsrInputRecordView.class, "6")) {
          tt.b();
       }
       this.B = b;
       this.s.removeTextChangedListener(this.J);
       b tx = this.x;
       if (tx != null) {
          tx.h(objArray);
       }
       this.y.b(this.G);
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, b.class, "13")) {
          return;
       }
       this.u.setVisibility(8);
       return;
    }
    public void R8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "12")) {
          return;
       }
       this.u.setText(p0);
       this.u.setVisibility(0);
       return;
    }
    public void S8(boolean p0){
       b tx;
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, b.class, "9")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_ASR_INPUT, "stopAsrInput");
       if (p0) {
          ja.a();
       }
       this.s.setFocusable(true);
       if (!PatchProxy.applyVoid(null, this, b.class, "15")) {
          tx = this.p;
          if (tx != null) {
             tx.E.unMute();
          }
       }
       tx = this.x;
       if (tx != null) {
          tx.i();
       }
       return;
    }
    public void V8(){
       if (PatchProxy.applyVoid(null, this, b.class, "17")) {
          return;
       }
       b tx = this.x;
       if (tx != null && tx.d()) {
          this.S8(true);
          this.t.c();
       }
       return;
    }
    public void W8(String p0,boolean p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uob, "16")) {
          return;
       }
       if (this.x != null && !TextUtils.x(p0)) {
          if (this.x.d()) {
             this.P8();
          }
          if (!TextUtils.x(this.z)) {
             p0 = this.z+p0;
          }
          if (p1) {
             this.s.setText(p0);
          }
       }
    label_004c :
       return;
    }
    public void X8(){
       if (PatchProxy.applyVoid(null, this, b.class, "10")) {
          return;
       }
       if (this.x == null) {
          return;
       }
       int i = ((TextUtils.G(this.s).toString()).trim()).length();
       int i1 = 0;
       int i2 = (i > 0 && !this.x.d())? 1: 0;
       b tv = this.v;
       int i3 = (i2)? 0: 8;
       tv.setVisibility(i3);
       tv = this.w;
       if (!i2) {
          i1 = 8;
       }
       tv.setVisibility(i1);
       if (i > 0) {
          this.P8();
       }else {
          this.R8(a1.p(R.string.arg_RES_7f101e1e));
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a0ca8);
       this.t = m1.f(p0, 0x7f0a18ff);
       this.u = m1.f(p0, 0x7f0a1901);
       this.v = m1.f(p0, 0x7f0a18fd);
       this.w = m1.f(p0, 0x7f0a18fe);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new g();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, b.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(b.class, new g());
       }else {
          obj.put(b.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.p = this.s8(a0.class);
       this.q = this.r8("EDITOR_FRAGMENT");
       this.r = this.r8("COMPLETE_SERVICE");
       this.x = this.r8("ASR_MANAGER");
       this.y = this.r8("EDITOR_FRAGMENT_OBSERVERS");
       return;
    }
}
