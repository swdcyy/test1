package kb.b;
import kb.e;
import java.lang.Object;
import kb.c;

public abstract class b implements e	// class@002497
{

    public void b(){
       super();
    }
    public void onCancellation(c p0){
    }
    public void onFailure(c p0){
       this.onFailureImpl(p0);
       p0.close();
    }
    public abstract void onFailureImpl(c p0);
    public void onNewResult(c p0){
       this.onNewResultImpl(p0);
       if (p0.a()) {
          p0.close();
       }
       return;
    }
    public abstract void onNewResultImpl(c p0);
    public void onProgressUpdate(c p0){
    }
}
