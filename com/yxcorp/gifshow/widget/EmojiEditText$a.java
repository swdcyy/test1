package com.yxcorp.gifshow.widget.EmojiEditText$a;
import android.text.TextWatcher;
import com.yxcorp.gifshow.widget.EmojiEditText;
import java.lang.Object;
import android.text.Editable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.widget.KSTextDisplayHandler;
import java.lang.CharSequence;

public class EmojiEditText$a implements TextWatcher	// class@00182f
{
    public int b;
    public int c;
    public final EmojiEditText d;

    public void EmojiEditText$a(EmojiEditText p0){
       this.d = p0;
       super();
       this.b = 0;
       this.c = 0;
    }
    public void afterTextChanged(Editable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EmojiEditText$a.class, "1")) {
          return;
       }
       this.d.j.a(p0);
       return;
    }
    public void beforeTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
       this.b = p1;
       this.c = p3;
    }
}
