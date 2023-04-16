package com.swmansion.rnscreens.ScreenStackHeaderConfig$a;
import android.view.View$OnClickListener;
import com.swmansion.rnscreens.ScreenStackHeaderConfig;
import java.lang.Object;
import android.view.View;
import com.swmansion.rnscreens.ScreenStackFragment;
import com.swmansion.rnscreens.ScreenStack;
import com.swmansion.rnscreens.Screen;
import com.swmansion.rnscreens.ScreenFragment;
import androidx.fragment.app.Fragment;

public class ScreenStackHeaderConfig$a implements View$OnClickListener	// class@000cb2
{
    public final ScreenStackHeaderConfig b;

    public void ScreenStackHeaderConfig$a(ScreenStackHeaderConfig p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       ScreenStackFragment screenFragme = this.b.getScreenFragment();
       if (screenFragme != null) {
          ScreenStack screenStack = this.b.getScreenStack();
          if (screenStack != null && screenStack.getRootScreen() == screenFragme.Ug()) {
             Fragment parentFragme = screenFragme.getParentFragment();
             if (parentFragme instanceof ScreenStackFragment) {
                parentFragme.dismiss();
             }
          }else {
             screenFragme.dismiss();
          }
       }
       return;
    }
}
