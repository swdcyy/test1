package com.yxcorp.gifshow.helper.editor.RequestFollowFloatEditorFragment;
import com.kwai.feature.component.commonfragment.baseeditor.FloatEditorFragment;
import com.yxcorp.gifshow.helper.editor.RequestFollowFloatEditorFragment$a;
import nsd.u;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import android.widget.TextView;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import qrd.l1;
import bld.b;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import zf6.j;
import android.graphics.drawable.Drawable;
import androidx.fragment.app.Fragment;
import com.kwai.framework.model.user.User;
import android.widget.EditText;
import android.content.Context;
import com.yxcorp.gifshow.helper.editor.RequestFollowFloatEditorFragment$c;
import android.text.InputFilter;
import java.util.Arrays;
import com.yxcorp.gifshow.helper.editor.RequestFollowFloatEditorFragment$b;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$Arguments;
import android.view.ViewStub;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.UpBizFt;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public final class RequestFollowFloatEditorFragment extends FloatEditorFragment	// class@001635
{
    public View w1;
    public static final RequestFollowFloatEditorFragment$a x1;

    static {
       RequestFollowFloatEditorFragment.x1 = new RequestFollowFloatEditorFragment$a(null);
    }
    public void RequestFollowFloatEditorFragment(){
       super();
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       ViewGroup$LayoutParams obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, RequestFollowFloatEditorFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "inflater");
       View view = super.onCreateView(p0, p1, p2);
       p1 = null;
       if (view == null) {
          return p1;
       }
       a.o(view, "super.onCreateView\(infla\x20\x02anceState\) ?: return null\x00");
       TextView textView = view.findViewById(R.id.finish_button);
       textView.setTextSize(0, (float)a1.d(R.dimen.arg_RES_7f070283));
       a.o(textView, "finishButton");
       obj = textView.getLayoutParams();
       obj.width = -2;
       textView.setLayoutParams(obj);
       View view1 = view.findViewById(R.id.editor_animation_frame);
       if (view1 != null) {
          b uob = new b();
          uob.g(KwaiRadiusStyles.TL8_TR8);
          uob.v(j.d(view, R.color.arg_RES_7f060091));
          view1.setBackground(uob.a());
       }
       Bundle arguments = this.getArguments();
       b obj1 = (arguments != null)? arguments.get("args_user_info"): p1;
       if (obj1 instanceof User) {
          p1 = obj1;
       }
       if (p1 != null) {
          textView.setPadding(a1.d(R.dimen.pv), textView.getPaddingTop(), a1.d(R.dimen.pv), textView.getPaddingBottom());
          FloatEditorFragment tW0 = this.W0;
          String str = "mEditor";
          a.o(tW0, str);
          FloatEditorFragment tW01 = this.W0;
          a.o(tW01, str);
          this.W0.setPadding(a1.d(R.dimen.arg_RES_7f070271), tW0.getPaddingTop(), a1.d(R.dimen.arg_RES_7f070271), tW01.getPaddingBottom());
          FloatEditorFragment tW02 = this.W0;
          a.o(tW02, str);
          obj1 = new b();
          FloatEditorFragment tW03 = this.W0;
          a.o(tW03, str);
          obj1.v(j.b(tW03.getContext(), R.color.arg_RES_7f061731));
          obj1.g(new RequestFollowFloatEditorFragment$c());
          tW02.setBackground(obj1.a());
          tW02 = this.W0;
          a.o(tW02, str);
          FloatEditorFragment tW04 = this.W0;
          a.o(tW04, str);
          InputFilter[] inputFilterA = Arrays.copyOf(tW02.getFilters(), (tW04.getFilters().length + 1));
          inputFilterA[(inputFilterA.length - 1)] = new RequestFollowFloatEditorFragment$b(this.M.mTextLimit);
          tW04 = this.W0;
          a.o(tW04, str);
          tW04.setFilters(inputFilterA);
          if (this.w1 == null) {
             ViewStub viewStub = view.findViewById(R.id.edit_tip_vs);
             if (viewStub != null) {
                viewStub.setLayoutResource(R.layout.arg_RES_7f0d1317);
                View view2 = viewStub.inflate();
                this.w1 = view2;
                if (!PatchProxy.applyVoidTwoRefs(view2, p1, this, RequestFollowFloatEditorFragment.class, "2") && view2 != null) {
                   a$a tW05 = a.d();
                   tW05.b(":ks-components:follow-user");
                   tW05.f(UpBizFt.FT_Social);
                   view2.findViewById(R.id.head).X(p1.mAvatars, tW05.a());
                   textView = view2.findViewById(R.id.tips_tv);
                   int i = (p1.isFemale())? 0x7f104240: 0x7f104241;
                   textView.setText(i);
                }
             }
          }
          RequestFollowFloatEditorFragment tw1 = this.w1;
          if (tw1 != null) {
             tw1.setVisibility(0);
          }
       }
       return view;
    }
}
