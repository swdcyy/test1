package com.kuaishou.live.common.core.component.multichat.chatedit.dialog.LiveChatLabelEditVC$mTextWatcher$2$a;
import tyc.u4;
import com.kuaishou.live.common.core.component.multichat.chatedit.dialog.LiveChatLabelEditVC$mTextWatcher$2;
import android.text.Editable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.live.common.core.component.multichat.chatedit.dialog.LiveChatLabelEditVC;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import android.widget.ImageView;
import java.lang.StringBuilder;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import zsd.u;
import androidx.appcompat.widget.AppCompatEditText;
import java.util.Objects;
import kotlin.text.StringsKt__StringsKt;
import android.widget.EditText;

public final class LiveChatLabelEditVC$mTextWatcher$2$a extends u4	// class@0014cd
{
    public final LiveChatLabelEditVC$mTextWatcher$2 b;

    public void LiveChatLabelEditVC$mTextWatcher$2$a(LiveChatLabelEditVC$mTextWatcher$2 p0){
       this.b = p0;
       super();
    }
    public void afterTextChanged(Editable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveChatLabelEditVC$mTextWatcher$2$a.class, "2")) {
          return;
       }
       if (p0 != null) {
          if (TextUtils.isEmpty(p0)) {
             LiveChatLabelEditVC.W2(this.b.this$0).setText("0/6");
             LiveChatLabelEditVC.V2(this.b.this$0).setVisibility(8);
          }else if(p0.length() <= 6){
             LiveChatLabelEditVC.W2(this.b.this$0).setText(p0.length()+"/6");
             LiveChatLabelEditVC.V2(this.b.this$0).setVisibility(0);
          }
       }
       return;
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(LiveChatLabelEditVC$mTextWatcher$2$a.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, LiveChatLabelEditVC$mTextWatcher$2$a.class, "1")) {
          return;
       }
       Editable obj = null;
       String str = (p0 != null)? p0.toString(): obj;
       a.m(str);
       boolean b = false;
       if (u.q2(str, " ", b, 2, obj) || u.H1(p0.toString(), " ", b, 2, obj)) {
          String str1 = p0.toString();
          Objects.requireNonNull(str1, "null cannot be cast to non-null type kotlin.CharSequence");
          str1 = StringsKt__StringsKt.A5(str1).toString();
          Objects.requireNonNull(str1, "null cannot be cast to non-null type kotlin.CharSequence");
          this.b.this$0.X2().setText(StringsKt__StringsKt.u5(str1).toString());
          AppCompatEditText uAppCompatEd = this.b.this$0.X2();
          obj = this.b.this$0.X2().getText();
          if (obj != null) {
             b = obj.length();
          }
          uAppCompatEd.setSelection(b);
       }
       return;
    }
}
