package com.yxcorp.gifshow.activity.share.presenter.c2$a;
import tyc.u4;
import com.yxcorp.gifshow.activity.share.presenter.c2;
import android.text.Editable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xw8.p0;
import f66.i;
import jq.a;
import q87.c;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.kwai.library.widget.edittext.SafeEditText;
import com.yxcorp.gifshow.widget.KSTextDisplayHandler;
import com.yxcorp.gifshow.widget.EmojiEditText;
import java.util.ArrayList;
import android.widget.EditText;
import java.lang.StringBuilder;
import java.util.Iterator;
import java.util.List;
import com.gifshow.twitter.widget.Extractor$Entity;
import java.lang.Integer;
import java.lang.CharSequence;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Publish;
import com.kuaishou.edit.draft.CaptionTopic;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Publish$b;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import com.yxcorp.gifshow.activity.share.topic.ShareTopicSearchV3Fragment;

public class c2$a extends u4	// class@0013d1
{
    public final c2 b;

    public void c2$a(c2 p0){
       this.b = p0;
       super();
    }
    public void afterTextChanged(Editable p0){
       Object[] objArray;
       Object[] objArray1;
       c2 e;
       int i1;
       c2 uoc2 = c2.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, c2$a.class, "1")) {
          return;
       }
       if (this.b.q.H == null) {
          return;
       }
       int i = 0;
       if ((p0.toString()).isEmpty()) {
          objArray = new Object[i];
          a.b().s("ShareTopicV3Presenter", "afterTextChanged hideFragment", objArray);
          this.b.W8();
          this.b.R8();
       }else {
          Object[] objArray2 = new Object[i];
          a.b().s("ShareTopicV3Presenter", "afterTextChanged showFragment", objArray2);
          c2$a tb = this.b;
          Objects.requireNonNull(tb);
          objArray2 = null;
          String str = PatchProxy.apply(objArray2, tb, uoc2, "6");
          if (str != PatchProxyResult.class) {
          }else if(tb.y.getText() == null || !tb.y.getText().length()){
             int selectionEnd = tb.y.getSelectionEnd();
             Object[] objArray5 = new Object[i];
             a.b().s("ShareTopicV3Presenter", "findCurrentTag selection end: "+selectionEnd, objArray5);
             Iterator iterator1 = tb.y.getKSTextDisplayHandler().d().iterator();
             while (true) {
                if (iterator1.hasNext()) {
                   Extractor$Entity uEntity = iterator1.next();
                   if (selectionEnd > uEntity.b().intValue() && selectionEnd <= uEntity.a().intValue()) {
                      str = uEntity.d();
                      break ;
                   }
                }else if(!selectionEnd){
                   i1 = selectionEnd - 1;
                   char c = tb.y.getText().charAt(i1);
                   if (c == 0xff03 || c == '#') {
                      if (selectionEnd > 1 && tb.y.getText().charAt((selectionEnd - 2)) != ' ') {
                         tb.y.getText().insert(i1, " ");
                      }
                      str = "#";
                      break ;
                   }
                }
             }
          }
          str = objArray2;
          Object[] objArray3 = new Object[i];
          a.b().s("ShareTopicV3Presenter", "当前标签: "+str, objArray3);
          tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(objArray2, tb, uoc2, "16")) {
             uoc2 = tb.u;
             if (uoc2 != null && uoc2.v() != null) {
                ArrayList uArrayList = tb.y.getKSTextDisplayHandler().e();
                if (!uArrayList.size()) {
                   tb.R8();
                }else {
                   ArrayList uArrayList1 = new ArrayList();
                   Iterator iterator = tb.u.v().getCaptionTopicList().iterator();
                   i1 = 0;
                   while (iterator.hasNext()) {
                      CaptionTopic uCaptionTopi = iterator.next();
                      if (!uArrayList.contains(uCaptionTopi.getTopicName())) {
                         Object[] objArray4 = new Object[i];
                         a.b().w("ShareTopicV3Presenter", "removeTopicFromDraft: "+uCaptionTopi.getTopicName(), objArray4);
                         uArrayList1.add(Integer.valueOf(i1));
                      }
                      i1 = i1 + 1;
                   }
                   int i2 = uArrayList1.size();
                   i2 = i2 - 1;
                   while (i2 >= 0) {
                      tb.u.c0();
                      Publish$b uob = tb.u.k();
                      uob.copyOnWrite();
                      uob.instance.removeCaptionTopic(uArrayList1.get(i2).intValue());
                      tb.u.f();
                   }
                }
             }
          }
          if (TextUtils.x(str)) {
             objArray = new Object[i];
             a.b().s("ShareTopicV3Presenter", "不是标签正常输入", objArray);
             this.b.W8();
             return;
          }else if("#".equals(str)){
             objArray = new Object[i];
             a.b().s("ShareTopicV3Presenter", "单独#显示历史", objArray);
             this.b.q.p(2);
             e = this.b.E;
             e.a();
          }else if(!TextUtils.x(str) && str.startsWith("#")){
             str = str.replaceAll("^#+", "");
          }
          e = this.b.D;
          if (!e.isAdded()) {
             Bundle arguments = this.b.D.getArguments();
             if (arguments == null) {
                arguments = new Bundle();
             }
             arguments.putString("search_key", str);
             this.b.D.setArguments(arguments);
          }else {
             this.b.D.Ih(str, true);
          }
          c2$a tb1 = this.b;
          if (tb1.H != null) {
             tb1.V8(e);
          }else if(e == tb1.F){
             objArray1 = new Object[i];
             a.b().s("ShareTopicV3Presenter", "当前fragment已经显示了不需要重新显示: "+e, objArray1);
             return;
          }else {
             tb1.V8(e);
          }
       }
       objArray1 = new Object[i];
       a.b().s("ShareTopicV3Presenter", "currentFragment: "+this.b.F, objArray1);
       return;
    }
}
