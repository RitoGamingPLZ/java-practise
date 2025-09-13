class Badge {
    public String print(Integer id, String name, String department) {
        // throw new UnsupportedOperationException("Please implement the Badge.print() method");
        String idBadge = "";
        String depart = "OWNER";
        if (id != null) idBadge = String.format("[%d] - ", id);
        if (department != null) depart = department.toUpperCase();
        return String.format("%s%s - %s", idBadge, name, depart);
    }
}
