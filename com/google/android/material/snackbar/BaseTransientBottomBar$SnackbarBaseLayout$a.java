package com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout$a;
import b2.c$b;
import com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout;
import java.lang.Object;

public class BaseTransientBottomBar$SnackbarBaseLayout$a implements c$b	// class@0016ab
{
    public final BaseTransientBottomBar$SnackbarBaseLayout a;

    public void BaseTransientBottomBar$SnackbarBaseLayout$a(BaseTransientBottomBar$SnackbarBaseLayout p0){
       this.a = p0;
       super();
    }
    public void onTouchExplorationStateChanged(boolean p0){
       this.a.setClickableOrFocusableBasedOnAccessibility(p0);
    }
}
