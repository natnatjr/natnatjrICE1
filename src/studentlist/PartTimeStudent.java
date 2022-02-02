package studentlist;
/**
 * @author Rich Smith at ZenOfProgramming.com
 */
public class PartTimeStudent extends Student
{
   private int numCourse;

   public PartTimeStudent (String studentId, String studentName, int numCourse)
   {
      super(studentId, studentName);   // Call the constructor of student class
      this.numCourse = numCourse;
   }

   public int getNumCourse ()
   {
      return numCourse;
   }

   public void setNumCourse (int numCourse)
   {
      this.numCourse = numCourse;

   }

}
