package com.kuaishou.post.story.widget.StoryEditText$a;
import android.text.TextWatcher;
import com.kuaishou.post.story.widget.StoryEditText;
import java.lang.Object;
import android.text.Editable;
import java.lang.CharSequence;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.widget.EditText;
import android.view.ViewTreeObserver;
import com.kuaishou.post.story.widget.StoryEditText$a$a;
import android.view.ViewTreeObserver$OnPreDrawListener;

public class StoryEditText$a implements TextWatcher	// class@000b8d
{
    public final StoryEditText b;

    public void StoryEditText$a(StoryEditText p0){
       this.b = p0;
       super();
    }
    public void afterTextChanged(Editable p0){
    }
    public void beforeTextChanged(CharSequence p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(StoryEditText$a.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, StoryEditText$a.class, "1")) {
          return;
       }
       this.b.removeTextChangedListener(this);
       this.b.getViewTreeObserver().addOnPreDrawListener(new StoryEditText$a$a(this, p0.toString(), p1));
       return;
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
}
