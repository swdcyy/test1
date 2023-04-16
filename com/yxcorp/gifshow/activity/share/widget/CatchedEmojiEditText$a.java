package com.yxcorp.gifshow.activity.share.widget.CatchedEmojiEditText$a;
import android.view.inputmethod.InputConnectionWrapper;
import com.yxcorp.gifshow.activity.share.widget.CatchedEmojiEditText;
import android.view.inputmethod.InputConnection;
import java.lang.CharSequence;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import f66.i;
import jq.a;
import java.lang.Throwable;
import q87.c;

public class CatchedEmojiEditText$a extends InputConnectionWrapper	// class@001498
{
    public final CatchedEmojiEditText a;

    public void CatchedEmojiEditText$a(CatchedEmojiEditText p0,InputConnection p1,boolean p2){
       this.a = p0;
       super(p1, p2);
    }
    public boolean commitText(CharSequence p0,int p1){
       Object obj;
       if (PatchProxy.isSupport(CatchedEmojiEditText$a.class)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, CatchedEmojiEditText$a.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p0 == null) {
          return false;
       }else {
          try{
             return super.commitText(p0.toString(), p1);
          }catch(java.lang.IndexOutOfBoundsException e4){
             a.b().e("CatchedEmojiEditText", "commitText: ", e4);
             return obj;
          }
       }
    }
    public CharSequence getSelectedText(int p0){
       if (PatchProxy.isSupport(CatchedEmojiEditText$a.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, CatchedEmojiEditText$a.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          return super.getSelectedText(p0);
       }catch(java.lang.IndexOutOfBoundsException e4){
          a.b().e("CatchedEmojiEditText", "", e4);
          return null;
       }
    }
}
