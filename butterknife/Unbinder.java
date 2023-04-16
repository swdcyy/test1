package butterknife.Unbinder;
import butterknife.a;

public interface abstract Unbinder	// class@000b9e
{
    public static final Unbinder EMPTY;

    static {
       Unbinder.EMPTY = a.a;
    }
    void unbind();
}
