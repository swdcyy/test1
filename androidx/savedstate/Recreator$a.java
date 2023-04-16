package androidx.savedstate.Recreator$a;
import androidx.savedstate.SavedStateRegistry$b;
import androidx.savedstate.SavedStateRegistry;
import java.lang.Object;
import java.util.HashSet;
import java.lang.String;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;

public final class Recreator$a implements SavedStateRegistry$b	// class@000984
{
    public final Set a;

    public void Recreator$a(SavedStateRegistry p0){
       super();
       this.a = new HashSet();
       p0.d("androidx.savedstate.Restarter", this);
    }
    public Bundle g(){
       Bundle uBundle = new Bundle();
       uBundle.putStringArrayList("classes_to_restore", new ArrayList(this.a));
       return uBundle;
    }
}
