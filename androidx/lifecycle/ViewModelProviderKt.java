package androidx.lifecycle.ViewModelProviderKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModel;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import java.lang.Object;

public final class ViewModelProviderKt	// class@000809
{

    public static final ViewModel get(ViewModelProvider p0){
       a.y(4, "VM");
       ViewModel viewModel = p0.get(ViewModel.class);
       a.h(viewModel, "get\(VM::class.java\)");
       return viewModel;
    }
}
