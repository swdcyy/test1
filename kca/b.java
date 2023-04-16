package kca.b;
import androidx.lifecycle.ViewModelProvider$Factory;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import uwc.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.editor.fine.tuning.vm.FineTuningViewModel;
import com.yxcorp.gifshow.editor.fine.tuning.repo.FineTuningRepo;
import java.lang.IllegalArgumentException;

public final class b implements ViewModelProvider$Factory	// class@002c43
{
    public final c a;
    public final b b;

    public void b(c p0,b p1){
       a.p(p0, "mWorkspaceDraft");
       a.p(p1, "editPicturesViewModel");
       super();
       this.a = p0;
       this.b = p1;
    }
    public ViewModel create(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "modelClass");
       if (a.g(p0, FineTuningViewModel.class)) {
          return new FineTuningViewModel(this.b, new FineTuningRepo(this.a));
       }
       throw new IllegalArgumentException("Donot Use FineTuningViewModelFactory to create vm");
    }
}
