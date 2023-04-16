package com.yxcorp.gifshow.v3.editor.text.widget.CommonDrawerEditText$a;
import android.view.ActionMode$Callback;
import java.lang.Object;
import android.view.ActionMode;
import android.view.MenuItem;
import android.view.Menu;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class CommonDrawerEditText$a implements ActionMode$Callback	// class@00150a
{

    public void CommonDrawerEditText$a(){
       super();
    }
    public boolean onActionItemClicked(ActionMode p0,MenuItem p1){
       return false;
    }
    public boolean onCreateActionMode(ActionMode p0,Menu p1){
       return false;
    }
    public void onDestroyActionMode(ActionMode p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CommonDrawerEditText$a.class, "1")) {
          return;
       }
       a.p(p0, "mode");
       return;
    }
    public boolean onPrepareActionMode(ActionMode p0,Menu p1){
       return false;
    }
}
