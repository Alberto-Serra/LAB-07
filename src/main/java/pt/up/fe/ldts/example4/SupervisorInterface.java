package pt.up.fe.ldts.example4;

public interface SupervisorInterface extends WorkerInterface {

    void addSupervisee(WorkerInterface worker);

    boolean isSupervisee(WorkerInterface worker);
}
