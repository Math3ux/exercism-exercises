class Badge {
    public String print(Integer id, String name, String department) {
        if(id != null && name != null && department != null){
            return "["+id+"] - "+name+" - "+ department.toUpperCase();
        }

        if (department == null){
            if(id == null){
                return name + " - OWNER";
            }
            return "["+id+"] - "+name+" - OWNER";
        }
    
        if (id == null){
            return name + " - " + department.toUpperCase();
        }
        return "batata";
    }
}
