/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.OrganizationDir;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseType.FoodDonation){
            enterprise =new FoodDonation(name);
            enterpriseList.add(enterprise);
              System.out.println("enterprise directory has been created");
        }
        else if(type==Enterprise.EnterpriseType.FoodSafety){
            enterprise=new FoodSafetyFDA(name);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.Delivery){
            enterprise=new Delivery(name);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.FoodReceiver){
            enterprise=new FoodReceiver(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
    
    public void deleteEnterprise(Enterprise enterprise){
        enterpriseList.remove(enterprise);
    }
}
