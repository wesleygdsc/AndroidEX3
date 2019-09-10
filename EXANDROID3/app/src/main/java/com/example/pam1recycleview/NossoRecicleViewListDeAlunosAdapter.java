package com.example.pam1recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NossoRecicleViewListDeAlunosAdapter  extends RecyclerView.Adapter {

    private final List<Aluno> listaDeAlunosRecebidaNoConstrutor;
    private final Context contexRecebidoNoConstrutor;

    public NossoRecicleViewListDeAlunosAdapter(List<Aluno> listadeAlunos, Context context) {

        this.listaDeAlunosRecebidaNoConstrutor = listadeAlunos;
        this.contexRecebidoNoConstrutor = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view =
                LayoutInflater.from(contexRecebidoNoConstrutor).
                        inflate(R.layout.nosso_recicleview_layout_resource_file, parent, false);

        AlunoViewHolder alunoViewHolder = new AlunoViewHolder(view);

        return alunoViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {

        AlunoViewHolder alunoViewHolder = (AlunoViewHolder) viewHolder;
        Aluno aluno = this.listaDeAlunosRecebidaNoConstrutor.get(position) ;

        alunoViewHolder.nomeTextView.setText(aluno.getNome());
        alunoViewHolder.idadeTextView.setText(aluno.getIdade().toString());

    }

    @Override

    public int getItemCount() {
        return this.listaDeAlunosRecebidaNoConstrutor.size();
    }
}
