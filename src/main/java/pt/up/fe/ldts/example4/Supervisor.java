package pt.up.fe.ldts.example4;

import java.util.HashSet;
import java.util.Set;

public class Supervisor extends Worker implements SupervisorInterface{
    Set<WorkerInterface> supervisee;
    
    public Supervisor(String name, String phone, String username, String password) {
        super(name, phone, username, password);
        supervisee = new HashSet<>();
    }

    @Override
    public void addSupervisee(WorkerInterface worker) {
        supervisee.add(worker);
    }

    @Override
    public boolean isSupervisee(WorkerInterface worker) {
        return supervisee.contains(worker);
    }
}
