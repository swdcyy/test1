package com.yxcorp.plugin.search.widget.SearchScrollSelectTextView$g;
import android.view.View$OnClickListener;
import com.yxcorp.plugin.search.widget.SearchScrollSelectTextView;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import android.content.ClipboardManager;
import java.lang.CharSequence;
import android.content.ClipData;

public class SearchScrollSelectTextView$g implements View$OnClickListener	// class@0007e9
{
    public final SearchScrollSelectTextView b;

    public void SearchScrollSelectTextView$g(SearchScrollSelectTextView p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchScrollSelectTextView$g.class, "1")) {
          return;
       }
       this.b.c.getSystemService("clipboard").setPrimaryClip(ClipData.newPlainText(this.b.z, this.b.z));
       this.b.f();
       this.b.b();
       return;
    }
}
