package com.yxcorp.gifshow.activity.share.widget.CatchedEmojiEditText;
import com.yxcorp.gifshow.widget.EmojiEditText;
import android.content.Context;
import android.graphics.Paint;
import android.widget.EditText;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.activity.share.widget.CatchedEmojiEditText$a;
import android.graphics.Canvas;
import android.widget.TextView;
import f66.i;
import jq.a;
import java.lang.Throwable;
import q87.c;
import com.yxcorp.gifshow.activity.share.widget.CatchedEmojiEditText$EditViewException;
import android.text.Editable;
import com.kwai.library.widget.edittext.SafeEditText;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import java.lang.Boolean;
import android.view.View;

public class CatchedEmojiEditText extends EmojiEditText	// class@001499
{

    public void CatchedEmojiEditText(Context p0){
       super(p0);
       this.setLayerType(1, null);
    }
    public void CatchedEmojiEditText(Context p0,AttributeSet p1){
       super(p0, p1);
       this.setLayerType(1, null);
    }
    public void CatchedEmojiEditText(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.setLayerType(1, null);
    }
    public InputConnection onCreateInputConnection(EditorInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CatchedEmojiEditText.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       InputConnection inputConnect = super.onCreateInputConnection(p0);
       if (inputConnect == null) {
          return null;
       }
       return new CatchedEmojiEditText$a(this, inputConnect, true);
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CatchedEmojiEditText.class, "1")) {
          return;
       }
       try{
          super.onDraw(p0);
       }catch(java.lang.RuntimeException e4){
          a.b().e("CatchedEmojiEditText", "CatchedEmojiEditText onDraw", e4);
          ExceptionHandler.handleCaughtException(new CatchedEmojiEditText$EditViewException(this, this.getText().toString()));
       }
       return;
    }
    public boolean performClick(){
       Object obj = PatchProxy.apply(null, this, CatchedEmojiEditText.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       try{
          return super.performClick();
       }catch(java.lang.RuntimeException e0){
          a.b().e("CatchedEmojiEditText", "CatchedEmojiEditText performClick", e0);
          return false;
       }
    }
}
