package com.kuaishou.post.story.widget.StoryEditText$b;
import android.text.TextWatcher;
import com.kuaishou.post.story.widget.StoryEditText;
import java.lang.Object;
import android.text.Editable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.EditText;
import rp4.m;
import android.text.TextPaint;
import qq4.d;
import com.kuaishou.post.story.widget.StoryEditText$d;
import java.lang.CharSequence;

public class StoryEditText$b implements TextWatcher	// class@000b8e
{
    public final StoryEditText b;

    public void StoryEditText$b(StoryEditText p0){
       this.b = p0;
       super();
    }
    public void afterTextChanged(Editable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StoryEditText$b.class, "1")) {
          return;
       }
       int i = (this.b.getWidth() - (m.m * 2)) - (m.c * 2);
       StoryEditText$b tb = this.b;
       StoryEditText k = tb.k;
       TextPaint paint = tb.getPaint();
       float lineSpacingM = this.b.getLineSpacingMultiplier();
       float lineSpacingE = this.b.getLineSpacingExtra();
       int i1 = (i > 0)? i: Integer.MAX_VALUE;
       k.a(p0, paint, lineSpacingM, lineSpacingE, i1);
       StoryEditText h = this.b.h;
       if (h != null) {
          h.a(p0);
       }
       return;
    }
    public void beforeTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
}
