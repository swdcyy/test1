package com.yxcorp.gifshow.activity.share.presenter.y1$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.activity.share.presenter.y1;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.edit.draft.Workspace$Type;
import ow8.c;
import com.kuaishou.edit.draft.Workspace$Source;
import xw8.p0;
import com.yxcorp.gifshow.activity.GifshowActivity;
import vw8.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import android.text.Editable;
import com.kwai.library.widget.edittext.SafeEditText;
import android.widget.EditText;
import f66.i;
import jq.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.widget.KSTextDisplayHandler;
import com.yxcorp.gifshow.widget.EmojiEditText;
import java.util.ArrayList;
import java.util.Iterator;
import com.gifshow.twitter.widget.Extractor$Entity;
import java.lang.Integer;
import java.lang.CharSequence;

public class y1$a extends m	// class@001459
{
    public final y1 c;

    public void y1$a(y1 p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       char c;
       if (PatchProxy.applyVoidOneRefs(p0, this, y1$a.class, "1")) {
          return;
       }
       y1$a tc = this.c;
       Objects.requireNonNull(tc);
       y1 oy1 = y1.class;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, tc, oy1, "9")) {
          int b = c.q(c.i(tc.x, tc.y), c.f(tc.x));
          int i = tc.v.b();
          int i1 = 0;
          if (i != 1) {
             if (i != 2) {
                if (i != 3 && i != 4) {
                   tc.w.onBackPressed();
                }else if(b && tc.u == null){
                   tc.v.p(i1);
                   tc.w.onBackPressed();
                }else {
                   tc.v.p(1);
                }
             }else if(b && tc.u == null){
                tc.v.p(i1);
                tc.w.onBackPressed();
             }else if(PatchProxy.applyVoid(objArray, tc, oy1, "11")){
                if (!PatchProxy.applyVoid(objArray, objArray, a.class, "31")) {
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action2 = "CANCEL_TOPIC";
                   u1.u(1, uElementPack, new ClientContent$ContentPackage());
                }
                if (tc.t.getText() != null) {
                   int selectionSta = tc.t.getSelectionStart();
                   Object[] objArray1 = new Object[i1];
                   a.b().s("ShareToolbarPresenter", "cursorIndex : "+selectionSta, objArray1);
                   Iterator iterator = tc.t.getKSTextDisplayHandler().d().iterator();
                   while (true) {
                      Integer integer = 0xff03;
                      if (iterator.hasNext()) {
                         Extractor$Entity uEntity = iterator.next();
                         Object[] objArray2 = new Object[i1];
                         a.b().s("ShareToolbarPresenter", "entry: "+uEntity.d()+" start: "+uEntity.b()+" end: "+uEntity.a(), objArray2);
                         if (selectionSta > uEntity.b().intValue() && selectionSta <= uEntity.a().intValue()) {
                            Object[] objArray3 = new Object[i1];
                            a.b().s("ShareToolbarPresenter", "remove tag: "+uEntity.d(), objArray3);
                            if (tc.t.getText().length() > uEntity.a().intValue()) {
                               c = tc.t.getText().charAt(uEntity.a().intValue());
                               if (c == integer || c == '#') {
                                  tc.t.getText().replace(uEntity.b().intValue(), (uEntity.a().intValue() + 1), "");
                                  tc.t.setSelection(uEntity.b().intValue());
                                  break ;
                               }
                            }
                            tc.t.getText().replace(uEntity.b().intValue(), uEntity.a().intValue(), "");
                            tc.t.setSelection(uEntity.b().intValue());
                            break ;
                         }
                      }else if(!selectionSta){
                         b = selectionSta - 1;
                         char c1 = tc.t.getText().charAt(b);
                         if (c1 == '#' || c1 == integer) {
                            tc.t.getText().replace(b, selectionSta, "");
                            tc.t.setSelection(b);
                            break ;
                         }
                      }
                   }
                }
             }
          }else {
             tc.v.p(i1);
             tc.w.onBackPressed();
          }
       }
       return;
    }
}
