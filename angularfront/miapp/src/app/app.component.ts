import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { ListaordenadorComponent } from './listaordenador/listaordenador.component';
import { FormularioOrdenadorComponent } from './formulario-ordenador/formulario-ordenador.component';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet,ListaordenadorComponent,FormularioOrdenadorComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent {
  title = 'miapp';
}
