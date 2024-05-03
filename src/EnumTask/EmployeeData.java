/*package EnumTask;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class EmployeeData {
    private String name;
    private String address;
    private String description;

    public EmployeeData(String name, String address, String description) {
        this.name = name;
        this.address = address;
        this.description = description;
    }
    public String getAddress(){return address;}
    public String getDescription(){return description;}
    public String getName(){return name;}
}
    public class FillTable {
        private static final int ADDRESS_INDEX = 2;
        private static final int DESCRIPTION_INDEX = 1;
        private static final int NAME_INDEX = 0;
        public List<EmployeeData> items;

        public FillTable(List<EmployeeData> items) {
            this.items = items;
        }
    }

    public Object getValueAt(EmployeeData row, EmployeeData col) {
        EmployeeData employeeData = (EmployeeData)items.get(row);
        switch (col){
            case NAME_INDEX:{return employeeData.getName(); }
            case DESCRIPTION_INDEX:{return employeeData.getDescription();}
            case ADDRESS_INDEX:{return employeeData.getAddress(); }
            default:{
                return "";
            }
        }
    }
}
public class Main {
 public void main(String[] args) {
         List < EmployeeData > employeeDataList = new ArrayList < >( Arrays .asList (new EmployeeData (" Alice ", " 123 Main St", " Software Engineer ") , new EmployeeData (" Bob ", " 456 Elm St", " Data Analyst ") , new EmployeeData (" Charlie ", " 789 Oak St", " Project Manager ")) ) ;

         FillTable fillTable = new FillTable ( employeeDataList ) ;

         System . out . println ( fillTable.getValueAt(0 , 2) ) ;
         }
 }*/
