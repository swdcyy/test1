package com.yxcorp.gifshow.v3.editor.music_v2.ui_new.EditMusicMainViewBinder;
import vrc.d;
import ei0.a;
import com.yxcorp.gifshow.v3.editor.music_v2.ui_new.EditMusicMainViewBinder$f;
import nsd.u;
import lnc.a1;
import androidx.fragment.app.Fragment;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.music_v2.ui_new.EditMusicMainViewBinder$tabHostFragment$2;
import msd.a;
import qrd.p;
import qrd.s;
import android.widget.TextView;
import android.widget.CheckBox;
import msc.q;
import lsc.f0;
import qrc.r;
import qrc.e;
import jn9.b;
import com.yxcorp.gifshow.v3.editor.music_v2.ui_new.EditMusicMainViewBinder$mRecommendMusicRecyclerView$2;
import com.yxcorp.gifshow.v3.editor.music_v2.ui_new.EditMusicMainViewBinder$collectMusicRecyclerView$2;
import com.yxcorp.gifshow.v3.editor.music_v2.ui_new.EditMusicMainViewBinder$mLocalMusicRecyclerView$2;
import com.yxcorp.gifshow.v3.editor.music_v2.ui_new.EditMusicMainViewBinder$mHistoryMusicRecyclerView$2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.v3.editor.music_v2.ui_new.EditMusicMainViewBinder$a;
import android.view.View$OnClickListener;
import android.text.TextPaint;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import java.lang.CharSequence;
import com.yxcorp.gifshow.v3.editor.music_v2.ui_new.EditMusicMainViewBinder$b;
import com.yxcorp.gifshow.v3.editor.music_v2.ui_new.EditMusicMainViewBinder$c;
import com.yxcorp.gifshow.v3.editor.music_v2.ui_new.EditMusicMainViewBinder$d;
import com.yxcorp.gifshow.v3.editor.music_v2.ui_new.EditMusicMainViewBinder$e;
import lsc.g0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import com.yxcorp.gifshow.v3.editor.music_v2.ui_new.MainTabHostFragment;
import java.lang.Boolean;
import lnc.i3;
import com.kwai.robust.PatchProxyResult;
import urc.e;
import urc.k;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import urc.j;
import urc.f;
import urc.i;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.music.vb.SwitchTab;
import esc.a;
import java.lang.Enum;
import java.util.List;
import java.util.Collection;
import faa.a;
import q87.c;
import oa0.a;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.v3.bubble.EditBubbleItem;
import com.yxcorp.gifshow.bubble.PostBubbleManager;
import com.yxcorp.gifshow.bubble.b;
import ra9.c;
import esc.d;
import com.yxcorp.gifshow.bubble.PostBubbleManager$c;
import com.yxcorp.gifshow.bubble.a;
import esc.b;
import com.yxcorp.gifshow.bubble.b$b;
import esc.c;
import e17.i;
import com.yxcorp.gifshow.v3.editor.music_v2.ui_new.EditMusicMainViewBinder$g;

public final class EditMusicMainViewBinder extends a implements d	// class@001100
{
    public final p c;
    public final TextView d;
    public final CheckBox e;
    public final CheckBox f;
    public final CheckBox g;
    public final TextView h;
    public final View i;
    public final q j;
    public final r k;
    public final e l;
    public final b m;
    public final b n;
    public final b o;
    public final b p;
    public final p q;
    public final p r;
    public final p s;
    public final p t;
    public final Fragment u;
    public static final int v;
    public static final EditMusicMainViewBinder$f w;

    static {
       EditMusicMainViewBinder.w = new EditMusicMainViewBinder$f(null);
       EditMusicMainViewBinder.v = a1.e(19.00f);
    }
    public void EditMusicMainViewBinder(Fragment p0,View p1){
       a.p(p0, "fragment");
       a.p(p1, "rootView");
       super(p1);
       this.u = p0;
       this.c = s.c(new EditMusicMainViewBinder$tabHostFragment$2(this));
       this.d = p1.findViewById(0x7f0a0536);
       CheckBox uCheckBox = p1.findViewById(R.id.checkbox_edit_voice);
       this.e = uCheckBox;
       CheckBox uCheckBox1 = p1.findViewById(R.id.checkbox_beat_sync);
       this.f = uCheckBox1;
       CheckBox uCheckBox2 = p1.findViewById(R.id.checkbox_edit_music);
       this.g = uCheckBox2;
       this.h = p1.findViewById(0x7f0a0538);
       View view = p1.findViewById(R.id.btn_edit_volume_container);
       this.i = view;
       this.j = f0.i(p0);
       this.k = f0.l(p0);
       this.l = f0.d(p0);
       this.m = f0.k(p0);
       this.n = f0.c(p0);
       this.o = f0.h(p0);
       this.p = f0.g(p0);
       this.q = s.c(new EditMusicMainViewBinder$mRecommendMusicRecyclerView$2(p1));
       this.r = s.c(new EditMusicMainViewBinder$collectMusicRecyclerView$2(p1));
       this.s = s.c(new EditMusicMainViewBinder$mLocalMusicRecyclerView$2(p1));
       this.t = s.c(new EditMusicMainViewBinder$mHistoryMusicRecyclerView$2(p1));
       if (PatchProxy.applyVoid(null, this, EditMusicMainViewBinder.class, "6")) {
       }else {
          int i1 = (a1.h() - (EditMusicMainViewBinder.v * 2)) / 4;
          View[] viewArray = new View[]{uCheckBox2,uCheckBox,uCheckBox1,view};
          for (int i2 = 0; i2 < 4; i2 = i2 + 1) {
             object oobject = viewArray[i2];
             a.o(oobject, "it");
             ViewGroup$LayoutParams layoutParams = oobject.getLayoutParams();
             layoutParams.width = i1;
             oobject.setLayoutParams(layoutParams);
          }
       }
       this.d.setOnClickListener(new EditMusicMainViewBinder$a(this));
       EditMusicMainViewBinder td = this.d;
       String str = "libraryButton";
       a.o(td, str);
       TextPaint paint = td.getPaint();
       a.o(paint, "libraryButton.paint");
       paint.setFakeBoldText(true);
       if (PostExperimentUtils.q0() == 2) {
          td = this.d;
          a.o(td, str);
          td.setText(a1.p(R.string.arg_RES_7f104529));
       }
       td = this.e;
       str = "voiceCheckbox";
       a.o(td, str);
       int i = (this.k.g != null)? 0: 8;
       td.setVisibility(i);
       td = this.e;
       a.o(td, str);
       paint = td.getPaint();
       a.o(paint, "voiceCheckbox.paint");
       paint.setFakeBoldText(true);
       this.e.setOnClickListener(new EditMusicMainViewBinder$b(this));
       td = this.g;
       a.o(td, "musicCheckbox");
       paint = td.getPaint();
       a.o(paint, "musicCheckbox.paint");
       paint.setFakeBoldText(true);
       td = this.g;
       a.o(td, "musicCheckbox");
       str = (PostExperimentUtils.t())? a1.p(R.string.arg_RES_7f103703): a1.p(R.string.arg_RES_7f10370b);
       td.setText(str);
       this.g.setOnClickListener(new EditMusicMainViewBinder$c(this));
       td = this.f;
       a.o(td, "beatSyncCheckbox");
       paint = td.getPaint();
       a.o(paint, "beatSyncCheckbox.paint");
       paint.setFakeBoldText(true);
       this.f.setOnClickListener(new EditMusicMainViewBinder$d(this));
       str = "volumeButtonContainer";
       if (this.k.f()) {
          td = this.i;
          a.o(td, str);
          td.setVisibility(0);
       }else {
          td = this.i;
          a.o(td, str);
          td.setVisibility(8);
       }
       td = this.h;
       a.o(td, "volumeButton");
       paint = td.getPaint();
       a.o(paint, "volumeButton.paint");
       paint.setFakeBoldText(true);
       this.h.setOnClickListener(new EditMusicMainViewBinder$e(this));
       if (!PatchProxy.applyVoid(null, null, g0.class, "4")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "RECO_MUSIC_PANEL";
          u1.u0(true, uElementPack, null);
       }
       return;
    }
    public void B(){
       if (PatchProxy.applyVoid(null, this, EditMusicMainViewBinder.class, "7")) {
          return;
       }
       e uoe = this.u.getChildFragmentManager().beginTransaction();
       uoe.v(R.id.main_tab_container, this.E());
       uoe.l();
       EditMusicMainViewBinder tg = this.g;
       a.o(tg, "musicCheckbox");
       boolean b = tg.isChecked();
       g0 og0 = g0.class;
       if (!PatchProxy.isSupport(og0) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), null, og0, "1")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "CLOSE_MUSIC";
          i3 oi3 = i3.f();
          oi3.a("is_check", Boolean.valueOf(b));
          uElementPack.params = oi3.e();
          u1.u0(1, uElementPack, null);
       }
       return;
    }
    public final Fragment D(){
       return this.u;
    }
    public final MainTabHostFragment E(){
       Object obj = PatchProxy.apply(null, this, EditMusicMainViewBinder.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.getValue();
    }
    public void Mb(e p0,e p1){
       int b2;
       b uob;
       EditMusicMainViewBinder uEditMusicMa2;
       int i3;
       b uob1;
       Object[] objArray2;
       ClientEvent$ElementPackage uElementPack1;
       Object obj = this;
       Object obj1 = p0;
       Object obj2 = p1;
       g0 og0 = g0.class;
       EditMusicMainViewBinder uEditMusicMa = EditMusicMainViewBinder.class;
       if (PatchProxy.applyVoidTwoRefs(obj1, obj2, obj, uEditMusicMa, "11")) {
          return;
       }
       a.p(obj1, "newState");
       a.p(obj2, "lastState");
       boolean b = true;
       if (!obj.k.f() || (!p0.x() || (!p1.x() && !PatchProxy.applyVoid(null, null, og0, "5")))) {
          uElementPack1 = new ClientEvent$ElementPackage();
          uElementPack1.action2 = "ADJUST_VOLUME";
          u1.u0(b, uElementPack1, null);
       }
    label_0048 :
       EditMusicMainViewBinder e = obj.e;
       String str = "voiceCheckbox";
       a.o(e, str);
       int i = 0;
       boolean b1 = (p0.v().i())? true: false;
       e.setChecked(b1);
       String str1 = 8;
       if (p0.v().h() && obj.k.e()) {
          e = obj.e;
          a.o(e, str);
          e.setVisibility(i);
          if (p0.x() && !p1.x()) {
             e = obj.e;
             a.o(e, str);
             b2 = e.isChecked();
             if (!PatchProxy.isSupport(og0) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b2), null, og0, "19")) {
                JsonObject jsonObject = new JsonObject();
                jsonObject.H("is_check", Boolean.valueOf(b2));
                uElementPack1 = new ClientEvent$ElementPackage();
                uElementPack1.action2 = "CLOSE_ORIGINAL_MUSIC";
                uElementPack1.params = jsonObject.toString();
                u1.u0(b, uElementPack1, null);
             }
          }
       }else {
          e = obj.e;
          a.o(e, str);
          e.setVisibility(str1);
       }
       boolean i1 = 0x7f103759;
       int i2 = 0x7f100b39;
       if (p0.u().d()) {
          obj.e.setText(i1);
       }else {
          obj.e.setText(i2);
       }
       if (p0.u().f()) {
          obj.e.setText(i1);
       }else {
          obj.e.setText(i2);
       }
       i1 = 3;
       String str2 = 2;
       String str3 = "musicCheckbox";
       if (p0.s().i() != null) {
          e = obj.g;
          a.o(e, str3);
          e.setEnabled(b);
          e = obj.g;
          a.o(e, str3);
          e.setChecked(b);
       }else {
          e = obj.g;
          a.o(e, str3);
          e.setChecked(i);
          b2 = a.b[p0.s().c().ordinal()];
          if (b2 != b) {
             if (b2 != str2) {
                if (b2 != i1) {
                   objArray2 = (b2 != 4)? null: obj.p;
                }else {
                   objArray2 = obj.o;
                }
             }else {
                objArray2 = obj.n;
             }
          }else {
             objArray2 = obj.m;
          }
          EditMusicMainViewBinder g = obj.g;
          a.o(g, str3);
          List list = (objArray2 != null)? objArray2.o(): null;
          b2 = (list == null || list.isEmpty())? 1: 0;
          g.setEnabled((b2 ^ b));
       }
       e = obj.g;
       a.o(e, str3);
       EditMusicMainViewBinder uEditMusicMa1 = 0x3f000000;
       if (e.isEnabled()) {
          e = obj.g;
          a.o(e, str3);
          e.setAlpha(0x3f800000);
       }else {
          e = obj.g;
          a.o(e, str3);
          e.setAlpha(uEditMusicMa1);
       }
       str3 = "libraryButton";
       if (PostExperimentUtils.q0() == str2) {
          e = obj.d;
          a.o(e, str3);
          e.setVisibility(i);
       }else if(p0.A()){
          e = obj.d;
          a.o(e, str3);
          e.setVisibility(i);
          if (obj1.J == null && !PostExperimentUtils.u()) {
             b2 = p0.y();
             if (!PatchProxy.isSupport(uEditMusicMa) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b2), obj, uEditMusicMa, "12")) {
                str3 = "EditMusicMainViewBinder";
                if (f0.e(obj.u).y != null) {
                   Object[] objArray = new Object[i];
                   a.D().w(str3, "show library bubble failed: cancel music tip can show", objArray);
                }else {
                   EditMusicMainViewBinder d = obj.d;
                   if (d == null || d.getVisibility()) {
                      Object[] objArray1 = new Object[i];
                      a.D().w(str3, "show library bubble failed: library entrance is invisible", objArray1);
                   }else {
                      i2 = TextUtils.x(a.n0()) ^ b;
                      i3 = TextUtils.x(a.r()) ^ b;
                      int i4 = TextUtils.x(a.W()) ^ b;
                      EditBubbleItem mUSIC_LIBRAR = EditBubbleItem.MUSIC_LIBRARY_ENTRANCE;
                      if (mUSIC_LIBRAR.couldShow() && (obj.l.a() || (!i2 || (obj.l.a() == b && !i3)))) {
                         if (!PatchProxy.applyVoid(null, obj, uEditMusicMa, "13")) {
                            uob1 = new b(mUSIC_LIBRAR);
                            uob1.b(obj.d);
                            uob1.j(new d(obj));
                            PostBubbleManager.d(obj.u).n(uob1);
                         }
                      }else {
                         mUSIC_LIBRAR = EditBubbleItem.MUSIC_LOCAL_GUIDE;
                         if (!mUSIC_LIBRAR.couldShow() || (b2 || (obj.l.a() != b || (!i4 && !PatchProxy.applyVoid(null, obj, uEditMusicMa, "14"))))) {
                            uob1 = new b(mUSIC_LIBRAR);
                            uob1.b(obj.d);
                            uob1.k(new b(obj));
                            uob1.j(new c(obj));
                            PostBubbleManager.d(obj.u).n(uob1);
                         }
                      }
                   }
                }
             }
          }
       }else {
          e = obj.d;
          a.o(e, str3);
          e.setVisibility(str1);
       }
       i oi = p0.s().i();
       b2 = (oi != null && oi.i() == b)? true: false;
       if (p0.l()) {
          EditMusicMainViewBinder f = obj.f;
          a.o(f, "beatSyncCheckbox");
          f.setAlpha(0x3f800000);
          f = obj.f;
          a.o(f, "beatSyncCheckbox");
          f.setChecked(b2);
       }else if(p0.s().i() != null){
          oi = p1.s().i();
          if (oi != null && (oi.i() == b && p0.f())) {
             i.d(R.style.arg_RES_7f11066a, p0.e());
          }
       }
       e = obj.f;
       a.o(e, "beatSyncCheckbox");
       e.setAlpha(0x3f000000);
       e = obj.f;
       a.o(e, "beatSyncCheckbox");
       e.setChecked(i);
       if (p0.f()) {
          e = obj.f;
          a.o(e, "beatSyncCheckbox");
          e.setVisibility(i);
          if (!p1.f() || (p0.x() && !p1.x())) {
             e = obj.f;
             a.o(e, "beatSyncCheckbox");
             b2 = e.isChecked();
             if (!PatchProxy.isSupport(og0) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b2), null, og0, "10")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "MUSIC_PANEL_MUSIC_POINT";
                i3 oi3 = i3.f();
                String str4 = (b2)? "on": "off";
                oi3.d("status", str4);
                uElementPack.params = oi3.e();
                u1.u0(b, uElementPack, null);
             }
          }
       }else {
          uEditMusicMa2 = obj.f;
          a.o(uEditMusicMa2, "beatSyncCheckbox");
          uEditMusicMa2.setVisibility(str1);
       }
       i obj3 = PatchProxy.applyTwoRefs(obj1, obj2, obj, uEditMusicMa, "15");
       if (obj3 != PatchProxyResult.class) {
          i = obj3.booleanValue();
       }else if(PostExperimentUtils.r0() != 3){
          obj3 = p0.s().i();
          uEditMusicMa2 = (obj3 != null && obj3.i() == b)? 1: null;
          i oi1 = p1.s().i();
          uob = (oi1 != null && oi1.i() == b)? 1: null;
          if (uEditMusicMa2) {
             if (p0.x() && p1.x()) {
                if (uob != null) {
                label_03cd :
                   b = 0;
                }
             }else if(p0.x() && !p1.x()){
             }
             i = b;
          }
       }
       if (i) {
          uob = new b(EditBubbleItem.MUSIC_POINT);
          uob.b(obj.f);
          uob.k(EditMusicMainViewBinder$g.a);
          PostBubbleManager.d(obj.u).n(uob);
       }
       this.E().Mb(obj1, obj2);
       return;
    }
}
