package com.yxcorp.gifshow.v3.g;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.v3.EditorActivity;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Object;
import android.view.View;
import com.yxcorp.gifshow.edit.draft.model.c;
import k2b.s;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import t36.f;
import ooc.j0;
import ooc.b0;
import t36.f$a;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import faa.a;
import q87.c;
import a17.c$a;
import android.app.Activity;
import java.util.ArrayList;
import a17.g;
import lnc.a1;
import com.kwai.library.widget.popup.sheet.SheetItemStatus;
import java.lang.CharSequence;
import java.util.List;
import ooc.s;
import a17.b$b;
import com.yxcorp.gifshow.v3.h;
import com.kwai.library.widget.popup.common.PopupInterface$d;
import com.kwai.library.widget.popup.common.c$b;
import a17.f;
import tkd.b;
import tkd.d;
import com.yxcorp.gifshow.dialog.PostDialogPlugin;
import com.yxcorp.gifshow.dialog.PostDialogPlugin$DialogScenario;
import java.lang.StringBuilder;

public final class g implements View$OnClickListener	// class@00153b
{
    public final EditorActivity b;
    public final c c;

    public void g(EditorActivity p0,c p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(View p0){
       g tb = this.b;
       g tc = this.c;
       int i = 0;
       String str = "EditorActivity";
       if (tb.X != null || tc.E()) {
          Object[] objArray = new Object[i];
          a.D().w(str, "recover title btn setOnClickListener mRecoverRecord: "+tb.X+", draft.isEmpty\(\) = "+tc.E(), objArray);
       }else {
          int i1 = 404;
          if (!PatchProxy.isSupport(s.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(i1), "click_to_record", null, null, s.class, "4")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action = i1;
             uElementPack.name = "click_to_record";
             i1 = 1;
             uElementPack.type = i1;
             u1.u(i1, uElementPack, null);
          }
          tb.j1.o0().s0(new b0(tc));
          if (DraftUtils.e0(tc)) {
             Object[] objArray1 = new Object[i];
             a.D().w(str, "Workspace unmodified. Return to recording.", objArray1);
             tb.X3(tc);
          }else {
             c$a uoa = new c$a(tb);
             uoa.l0(R.string.arg_RES_7f100b43);
             uoa.g0(R.string.cancel);
             ArrayList uArrayList = new ArrayList();
             uArrayList.add(new g(a1.p(R.string.arg_RES_7f100c50), SheetItemStatus.Primary));
             uoa.j0(uArrayList);
             uoa.i0(new s(tb, tc));
             uoa.J(h.a);
             f.a(uoa);
             d.a(0x34dc9f9c).xB(uoa, PostDialogPlugin$DialogScenario.UNKNOWN);
          }
       }
       return;
    }
}
