package androidx.work.impl.workers.CombineContinuationsWorker;
import androidx.work.Worker;
import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.ListenableWorker$a;
import androidx.work.a;
import androidx.work.ListenableWorker;

public class CombineContinuationsWorker extends Worker	// class@000aa0
{

    public void CombineContinuationsWorker(Context p0,WorkerParameters p1){
       super(p0, p1);
    }
    public ListenableWorker$a doWork(){
       return ListenableWorker$a.d(this.getInputData());
    }
}
