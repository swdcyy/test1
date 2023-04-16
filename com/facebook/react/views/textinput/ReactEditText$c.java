package com.facebook.react.views.textinput.ReactEditText$c;
import android.text.TextWatcher;
import com.facebook.react.views.textinput.ReactEditText;
import java.lang.Object;
import android.text.Editable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.util.ArrayList;
import java.lang.CharSequence;
import java.lang.Integer;

public class ReactEditText$c implements TextWatcher	// class@001425
{
    public final ReactEditText b;

    public void ReactEditText$c(ReactEditText p0){
       this.b = p0;
       super();
    }
    public void afterTextChanged(Editable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactEditText$c.class, "3")) {
          return;
       }
       ReactEditText$c tb = this.b;
       if (tb.c == null) {
          ReactEditText i = tb.i;
          if (i != null) {
             Iterator iterator = i.iterator();
             while (iterator.hasNext()) {
                iterator.next().afterTextChanged(p0);
             }
          }
       }
       return;
    }
    public void beforeTextChanged(CharSequence p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(ReactEditText$c.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, ReactEditText$c.class, "1")) {
          return;
       }
       ReactEditText$c tb = this.b;
       if (tb.c == null) {
          ReactEditText i = tb.i;
          if (i != null) {
             Iterator iterator = i.iterator();
             while (iterator.hasNext()) {
                iterator.next().beforeTextChanged(p0, p1, p2, p3);
             }
          }
       }
       return;
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(ReactEditText$c.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, ReactEditText$c.class, "2")) {
          return;
       }
       ReactEditText$c tb = this.b;
       if (tb.c == null) {
          ReactEditText i = tb.i;
          if (i != null) {
             Iterator iterator = i.iterator();
             while (iterator.hasNext()) {
                iterator.next().onTextChanged(p0, p1, p2, p3);
             }
          }
       }
       this.b.h();
       return;
    }
}
