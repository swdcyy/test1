package kotlin.io.FileWalkDirection;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class FileWalkDirection extends Enum	// class@00187e
{
    public static final FileWalkDirection[] $VALUES;
    public static final FileWalkDirection BOTTOM_UP;
    public static final FileWalkDirection TOP_DOWN;

    static {
       FileWalkDirection uFileWalkDir1;
       FileWalkDirection[] uFileWalkDir = new FileWalkDirection[]{uFileWalkDir1,uFileWalkDir1};
       uFileWalkDir1 = new FileWalkDirection("TOP_DOWN", 0);
       FileWalkDirection.TOP_DOWN = uFileWalkDir1;
       uFileWalkDir1 = new FileWalkDirection("BOTTOM_UP", 1);
       FileWalkDirection.BOTTOM_UP = uFileWalkDir1;
       FileWalkDirection.$VALUES = uFileWalkDir;
    }
    public void FileWalkDirection(String p0,int p1){
       super(p0, p1);
    }
    public static FileWalkDirection valueOf(String p0){
       return Enum.valueOf(FileWalkDirection.class, p0);
    }
    public static FileWalkDirection[] values(){
       return FileWalkDirection.$VALUES.clone();
    }
}
