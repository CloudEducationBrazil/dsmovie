import { ReactComponent as Arrow } from 'assets/img/arrow.svg';
import './styles.css';
import { MoviePage } from 'types/movie';

type Props = { page: MoviePage };

function Pagination({ page }: Props) {
  return (
    <div className="dsmovie-pagination-container">
      <div className="dsmovie-pagination-box">
        <button className="dsmovie-pagination-button" disabled={page.first}>
          <Arrow />
        </button>
        <p>{`${page.number + 1} de ${page.totalPages}`}</p>
        <button className="dsmovie-pagination-button" disabled={page.last}>
          <Arrow className="dsmovie-flip-horizontal" />
        </button>
      </div>
    </div>
  );
}
export default Pagination;
